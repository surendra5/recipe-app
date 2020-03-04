package com.springframeworkguru.recipeapp.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class MeasureUnitCommand {
    private Long id;
    private String description;
}
