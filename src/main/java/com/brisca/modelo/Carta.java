package com.brisca.modelo;


import com.google.gson.Gson;
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
    @Range(min = 1, max = 10, message = "El número válido debe estar entre 1 y 10")
    private Long numeroValido;
    @Enumerated(EnumType.STRING)
    @NotNull
    private PaloBaraja palo;
    @Positive
    @NotNull
    private double puntosValorJuego;
    @Override
    public String toString() {
        return switch (this.numeroValido.intValue()){
            case 8 -> "Sota de ";
            case 9 -> "Caballo de ";
            case 10 -> "Rey de ";
            default -> this.numeroValido+" de ";
        }+this.palo;
    }

}
