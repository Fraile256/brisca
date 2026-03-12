package com.brisca.repositorio;

import com.brisca.modelo.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JugadorRepository extends JpaRepository<Jugador, Long> {

    Jugador findByIdJugador(Long idJugador);
    Optional<Jugador> findByAliasJugador(String aliasJugador);
    void actualizarById(Long idJugador, Jugador jugador);
    void deleteJugadorById(Long idJugador);
}
