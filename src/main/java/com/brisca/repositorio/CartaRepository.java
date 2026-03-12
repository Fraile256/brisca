package com.brisca.repositorio;

import com.brisca.modelo.Carta;
import com.brisca.modelo.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartaRepository extends JpaRepository<Jugador, Long> {
    Carta findByIdValido(Long id);

}
