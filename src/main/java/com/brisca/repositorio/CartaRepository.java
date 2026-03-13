package com.brisca.repositorio;

import com.brisca.modelo.Carta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Repository
public interface CartaRepository extends JpaRepository<Carta, Long> {
    Optional<Carta> findByPuntosValorJuego(Long puntosValorJuego);
    Optional<Carta> findByPalo(String palo);
}
