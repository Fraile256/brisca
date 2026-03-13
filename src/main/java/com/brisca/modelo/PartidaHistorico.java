package com.brisca.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "partidas_historico")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PartidaHistorico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Positive
    @Min(value = 1, message = "El id debe ser mayor que 0")
    private Long Id;
    @NotNull
    private LocalDateTime fechaHoraInicio;
    @NotNull
    private String tipoJuego;
    @Positive
    private double boteApostado;
}
