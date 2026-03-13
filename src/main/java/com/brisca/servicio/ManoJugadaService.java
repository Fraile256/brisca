package com.brisca.servicio;

import com.brisca.modelo.ManoJugada;
import com.brisca.repositorio.ManoJugadaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ManoJugadaService {
    private ManoJugadaRepository repositorio;
    public ManoJugadaService(ManoJugadaRepository repositorio) {
        this.repositorio = repositorio;
    }
    public Optional<ManoJugada> findById(Long id) {
        return repositorio.findById(id);
    }
    public Optional<ManoJugada> findByManoGanadora(boolean manoGanadora) {
        return repositorio.findByManoGanadora(manoGanadora);
    }
    public ManoJugada save(ManoJugada manoJugada) {
        return repositorio.save(manoJugada);
    }


}
