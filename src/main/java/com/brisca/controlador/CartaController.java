package com.brisca.controlador;

import com.brisca.modelo.Carta;
import com.brisca.repositorio.CartaRepository;
import jakarta.validation.constraints.Positive;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cartas")
public class CartaController {
    private CartaRepository repositorio;
    public CartaController(CartaRepository repositorio) {
        this.repositorio = repositorio;
    }
    @GetMapping
    public List<Carta> findAllCartas() {
        return repositorio.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Carta> getCartaPorId(@Positive @PathVariable Long id) {
        return repositorio.findById(id);
    }
    @PostMapping
    public Carta saveCarta(@RequestBody Carta carta) {
        return repositorio.save(carta);
    }
    @GetMapping("/palo/{palo}")
    public Optional<Carta> getByPalo(@PathVariable String palo) {return repositorio.findByPalo(palo);}
}
