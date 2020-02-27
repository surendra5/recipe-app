package com.springframeworkguru.recipeapp.domain;

import lombok.*;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Lob
    private String note;

    @OneToOne
    private Recipe recipe;

}
