package com.brisca.modelo;


import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "cartas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Carta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Min(value = 1, message = "El id debe ser mayor que 0")
    private Long id;
    @Positive
    @Range(min = 1, max = 10)
    private int numeroValido;
    @Enumerated(EnumType.STRING)
    @NotNull
    private PaloBaraja palo;
    @Positive
    @NotNull
    private double puntosValorJuego;

}
