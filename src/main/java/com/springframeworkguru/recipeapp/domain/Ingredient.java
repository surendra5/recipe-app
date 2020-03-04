package com.springframeworkguru.recipeapp.domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount;
    private String description;

    @ManyToOne
    private Recipe recipe;

    @OneToOne(fetch = FetchType.EAGER)
    private MeasurementUnit measurementUnit;

    public Ingredient(String description, BigDecimal amount, MeasurementUnit measurementUnit) {
        this.description = description;
        this.amount = amount;
        this.measurementUnit = measurementUnit;
    }

}
