package com.brisca.repositorio;

import com.brisca.modelo.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JugadorRepository extends JpaRepository<Jugador, Long> {

    void registrarJugador(Long jugador_id, String aliasJugador, double saldoFichas);
    boolean eliminarJugadorPorId(Long jugador_id);
    boolean actualizarJugador(Long jugador_id);
    Optional<Jugador> buscarJugadorPorId(Long jugador_id);
}
