package com.brisca.controlador;

import com.brisca.modelo.PartidaHistorico;
import com.brisca.servicio.PartidaHistoricoService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/partidas_historico")
public class PartidaHistoricoController {
    private PartidaHistoricoService service;
    public PartidaHistoricoController(PartidaHistoricoService service) {
        this.service = service;
    }
    @GetMapping
    public List<PartidaHistorico> findAll() {
        return service.findAll();
    }
    @GetMapping("/{id}")
    public Optional<PartidaHistorico> findById(@PathVariable Long id) {
        return service.findById(id);
    }
    @GetMapping("/{fechaHoraInicio}")
    public Optional<PartidaHistorico> findByFechaHoraInicio(@PathVariable LocalDateTime fechaHoraInicio) {
        return service.findByFechaHoraInicio(fechaHoraInicio);
    }
    @GetMapping("/{tipoJuego}")
    public Optional<PartidaHistorico> findByTipoJuego(@PathVariable String tipoJuego) {
        return service.findByTipoJuego(tipoJuego);
    }
    @GetMapping("/{boteApostado}")
    public Optional<PartidaHistorico> findByBoteApostado(@PathVariable double boteApostado) {
        return service.findByBoteApostado(boteApostado);
    }
    @PostMapping
    public PartidaHistorico save(@RequestBody PartidaHistorico partidaHistorico) {
        return service.save(partidaHistorico);
    }

}
