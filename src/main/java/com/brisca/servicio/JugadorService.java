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

    public Optional<Jugador> buscarJugadorPorAlias(String aliasJugador){
        return repositorio.findByAliasJugador(aliasJugador);
    }
    public Jugador registrarJugador(Jugador jugador) {
        return repositorio.save(jugador);
    }
    public void borrarJugadorPorId(Long idJugador) {
        repositorio.deleteById(idJugador);
    }
    public void actualizarJugadorPorId(Long idJugador, Jugador jugador){
        repositorio.actualizarById(idJugador, jugador);
    }

}
