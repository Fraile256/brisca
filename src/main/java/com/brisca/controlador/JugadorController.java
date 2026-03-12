package com.brisca.controlador;

import com.brisca.modelo.Jugador;
import com.brisca.repositorio.JugadorRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/jugadores")
public class JugadorController {
    private final JugadorRepository repositorio;

    public JugadorController(JugadorRepository repositorio) {
        this.repositorio = repositorio;
    }

    @PostMapping
    public Jugador registrarJugador(@RequestBody Jugador jugador) {
        return repositorio.save(jugador);
    }

    @GetMapping
    public List<Jugador> listarJugadores() {
        return repositorio.findAll();
    }

    @GetMapping("/{jugador_id}")
    public ResponseEntity<Jugador> buscarJugadorPorId(@PathVariable Long jugador_id) {
        Optional<Jugador> jugador = repositorio.findById(jugador_id);
        return jugador.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{jugador_id}")
    public ResponseEntity<Jugador> actualizarJugador(@PathVariable Long jugador_id, @RequestBody Jugador jugadorDetails) {
        return repositorio.findById(jugador_id)
                .map(jugador -> {
                    jugador.setAliasJugador(jugadorDetails.getAliasJugador());
                    jugador.setSaldoFichas(jugadorDetails.getSaldoFichas());
                    Jugador updatedJugador = repositorio.save(jugador);
                    return ResponseEntity.ok(updatedJugador);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{jugador_id}")
    public ResponseEntity<Void> eliminarJugadorPorId(@PathVariable Long jugador_id) {
        if (repositorio.existsById(jugador_id)) {
            repositorio.deleteById(jugador_id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }

    }
}
