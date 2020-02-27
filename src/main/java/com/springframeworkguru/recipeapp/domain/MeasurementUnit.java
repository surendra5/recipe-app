package com.springframeworkguru.recipeapp.domain;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
public class MeasurementUnit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

}
