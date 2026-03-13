package com.brisca.modelo;

import jakarta.persistence.Id;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "jugadores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Jugador {
    @Id
    @Positive
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Min(value = 1, message = "El id debe ser mayor que 0.")
    private Long Id;
    @NotNull(message = "El nombre es obligatorio.")
    private String aliasJugador;
    @Positive(message = "El saldo de fichas debe ser mayor que 0.")
    private double saldoFichas;
}
