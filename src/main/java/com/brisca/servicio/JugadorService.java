package com.brisca.servicio;

import com.brisca.modelo.Jugador;
import com.brisca.repositorio.JugadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JugadorService {
    private JugadorRepository repositorio;
    public JugadorService(JugadorRepository repositorio) {
        this.repositorio = repositorio;
    }

    public Optional<Jugador> buscarJugadorPorAlias(Long idJugador){
        return repositorio.findById(idJugador);
    }
    public Jugador registrarJugador(Jugador jugador) {
        return repositorio.save(jugador);
    }
    public void borrarJugadorPorId(Long idJugador) {
        repositorio.deleteById(idJugador);
    }
    public void actualizarSaldoJugador(Long idJugador, double saldoFichas) {
        Jugador jugador = repositorio.findById(idJugador).orElseThrow();
        jugador.setSaldoFichas(saldoFichas);
        repositorio.save(jugador);
    }
    public List<Jugador> findAllJugadores() {
        return repositorio.findAll();
    }
}
