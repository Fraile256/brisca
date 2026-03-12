package com.brisca.servicio;

import com.brisca.modelo.Jugador;
import com.brisca.repositorio.JugadorRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JugadorService {
    private JugadorRepository repositorio;
    public JugadorService(JugadorRepository repositorio) {
        this.repositorio = repositorio;
    }
    public void registrarJugador(Long jugador_id, String aliasJugador, double saldoFichas) {
        repositorio.registrarJugador(jugador_id, aliasJugador, saldoFichas) ? false : true;
    }
    public boolean eliminarJugadorPorId(Long jugador_id) {
        return repositorio.eliminarJugadorPorId(jugador_id) ? false : true;
    }
    public boolean actualizarJugador(Long jugador_id, String aliasJugador, double saldoFichas) {
        return repositorio.actualizarJugador(jugador_id) ? false : true;
    }
    public Optional<Jugador> buscarJugadorPorId(Long jugador_id) {
        return repositorio.buscarJugadorPorId(jugador_id);
    }
}
