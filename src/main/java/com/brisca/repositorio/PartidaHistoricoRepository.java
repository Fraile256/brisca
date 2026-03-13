package com.brisca.repositorio;

import com.brisca.modelo.PartidaHistorico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.Optional;

public interface PartidaHistoricoRepository extends JpaRepository<PartidaHistorico, Long> {
    Optional<PartidaHistorico> findByFechaHoraInicio(LocalDateTime fechaHoraInicio);
    Optional<PartidaHistorico> findByTipoJuego(String tipoJuego);
    Optional<PartidaHistorico> findByBoteApostado(double boteApostado);
}
