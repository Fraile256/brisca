package com.brisca.servicio;

import com.brisca.modelo.Carta;
import com.brisca.repositorio.CartaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartasService {
    private CartaRepository repositorio;
    private Carta[] baraja;
    public CartasService(CartaRepository repositorio) {
        this.repositorio = repositorio;
        baraja = new Carta[40];
    }
    public Optional<Carta> findByPuntosValorJuego(Long puntosValorJuego) {
        return repositorio.findByPuntosValorJuego(puntosValorJuego);
    }
    public Optional<Carta> findByPalo(String palo) {
        return repositorio.findByPalo(palo);
    }
    public Carta crearCarta(Carta carta) {
        return repositorio.save(carta);
    }
    public List<Carta> findAll(){
        return repositorio.findAll();
    }
    public Carta save(Carta carta){
        return repositorio.save(carta);
    }
    public Carta[] barajar(Carta[] baraja){
        for (int i = 0; i < baraja.length; i++) {
            int j = (int) (Math.random() * baraja.length);
            Carta temp = baraja[i];
            baraja[i] = baraja[j];
            baraja[j] = temp;
        }
        return baraja;
    }

}
