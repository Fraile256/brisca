package com.brisca.controlador;

import com.brisca.modelo.Carta;
import com.brisca.modelo.Jugador;
import com.brisca.repositorio.CartaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cartas")
public class CartaController {
    private CartaRepository repositorio;
    public CartaController(CartaRepository repositorio) {
        this.repositorio = repositorio;
    }
    @GetMapping
    public List<Carta> listarCartas() {
        return repositorio.findAll();
    }
}
