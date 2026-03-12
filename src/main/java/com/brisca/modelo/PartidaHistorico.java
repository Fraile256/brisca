package com.brisca.modelo;

import jakarta.persistence.*;
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
    private Long Id;
    private LocalDateTime fechaHoraInicio;
    private String tipoJuego;
    private double boteApostado;
}
