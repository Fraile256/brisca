package com.brisca.servicio;

import com.brisca.modelo.Jugador;
import com.brisca.repositorio.CartaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartaService {
    private CartaRepository repositorio;
    public CartaService(CartaRepository repositorio) {
        this.repositorio = repositorio;
    }
    public Jugador findById(long id) {
        return repositorio.findById(id).orElse(null);
    }
    public Jugador save(Jugador carta) {
        return repositorio.save(carta);
    }
    public void deleteById(long id) {
        repositorio.deleteById(id);
    }
    public void update(Jugador carta) {
        repositorio.save(carta);
    }
    public List<Jugador> findAll() {
        return repositorio.findAll();
    }
}
