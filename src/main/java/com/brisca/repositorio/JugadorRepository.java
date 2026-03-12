package com.brisca.repositorio;

import com.brisca.modelo.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface JugadorRepository extends JpaRepository<Jugador, Long> {

    Optional<Jugador> findByAliasJugador(String aliasJugador);
    Optional<Jugador> findBySaldoFichas(double saldoFichas);

}
