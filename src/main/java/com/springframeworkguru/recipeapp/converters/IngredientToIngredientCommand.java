package com.springframeworkguru.recipeapp.converters;

import com.springframeworkguru.recipeapp.commands.IngredientCommand;
import com.springframeworkguru.recipeapp.domain.Ingredient;
import com.sun.istack.Nullable;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class IngredientToIngredientCommand implements Converter<Ingredient, IngredientCommand> {

    private final MeasurementUnitToMeasurementUnitCommand muConverter;

    public IngredientToIngredientCommand(MeasurementUnitToMeasurementUnitCommand muConverter) {
        this.muConverter = muConverter;
    }

    @Synchronized
    @Nullable
    @Override
    public IngredientCommand convert(Ingredient ingredient) {
        if (ingredient == null) {
            return null;
        }

        IngredientCommand ingredientCommand = new IngredientCommand();
        ingredientCommand.setId(ingredient.getId());

        ingredientCommand.setAmount(ingredient.getAmount());
        ingredientCommand.setDescription(ingredient.getDescription());
        ingredientCommand.setMeasureUnitCommand(muConverter.convert(ingredient.getMeasurementUnit()));
        return ingredientCommand;
    }
}
