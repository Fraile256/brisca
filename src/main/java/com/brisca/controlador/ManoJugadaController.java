package com.brisca.controlador;

import com.brisca.modelo.ManoJugada;
import com.brisca.servicio.ManoJugadaService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/manos_jugadas")
public class ManoJugadaController {
    private ManoJugadaService service;
    public ManoJugadaController(ManoJugadaService service) {
        this.service = service;
    }
    @GetMapping("/{id}")
    public Optional<ManoJugada> findById(@PathVariable Long id) {
        return service.findById(id);
    }
    @GetMapping
    public Optional<ManoJugada> findByManoGanadora(@PathVariable boolean manoGanadora) {
        return service.findByManoGanadora(manoGanadora);
    }
    @PostMapping
    public ManoJugada save(@RequestBody ManoJugada manoJugada) {
        return service.save(manoJugada);
    }


}
