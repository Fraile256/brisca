package com.brisca.servicio;

import com.brisca.modelo.PartidaHistorico;
import com.brisca.repositorio.PartidaHistoricoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PartidaHistoricoService {
    private PartidaHistoricoRepository repositorio;
    public PartidaHistoricoService(PartidaHistoricoRepository repositorio) {
        this.repositorio = repositorio;
    }
    public Optional<PartidaHistorico> findById(Long id) {
        return repositorio.findById(id);
    }
    public Optional<PartidaHistorico> findByFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        return repositorio.findByFechaHoraInicio(fechaHoraInicio);
    }
    public Optional<PartidaHistorico> findByTipoJuego(String tipoJuego) {
        return repositorio.findByTipoJuego(tipoJuego);
    }
    public Optional<PartidaHistorico> findByBoteApostado(double boteApostado) {
        return repositorio.findByBoteApostado(boteApostado);
    }
    public PartidaHistorico save(PartidaHistorico partidaHistorico) {
        return repositorio.save(partidaHistorico);
    }
    public List<PartidaHistorico> findAll() {
        return repositorio.findAll();
    }


}
