package com.brisca.modelo;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private int ordenTurno;
    private boolean fueManoGanadora;

}
