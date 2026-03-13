package com.brisca.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
import jakarta.websocket.OnMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "manosjugadas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ManoJugada {
    @Id
    @Positive
    @Min(value = 1, message = "El id debe ser mayor que 0")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private int ordenTurno;
    private boolean manoGanadora;
    @ManyToOne()
    @JoinColumn(name = "carta_id")
    private Carta id_carta;
    @ManyToOne()
    @JoinColumn(name = "jugador_id")
    private Jugador id_jugador;
    @ManyToOne()
    @JoinColumn(name = "partida_id")
    private PartidaHistorico id_partida;


}
