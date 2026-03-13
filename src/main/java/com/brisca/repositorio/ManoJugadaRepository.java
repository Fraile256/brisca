package com.brisca.repositorio;

import com.brisca.modelo.ManoJugada;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ManoJugadaRepository extends JpaRepository<ManoJugada, Long> {
    Optional<ManoJugada> findByManoGanadora(boolean manoGanadora);
}
