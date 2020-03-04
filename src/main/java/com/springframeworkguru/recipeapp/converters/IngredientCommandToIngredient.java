package com.springframeworkguru.recipeapp.converters;

import com.springframeworkguru.recipeapp.commands.IngredientCommand;
import com.springframeworkguru.recipeapp.domain.Ingredient;
import com.sun.istack.Nullable;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class IngredientCommandToIngredient implements Converter<IngredientCommand, Ingredient> {

    private final MeasurementUnitCommandToMeasurementUnit muConverter;

    public IngredientCommandToIngredient(MeasurementUnitCommandToMeasurementUnit muConverter) {
        this.muConverter = muConverter;
    }

    @Synchronized
    @Nullable
    @Override
    public Ingredient convert(IngredientCommand source) {
        if(source == null)
            return null;

        final Ingredient ingredient = new Ingredient();
        ingredient.setId(source.getId());
        ingredient.setAmount(source.getAmount());
        ingredient.setDescription(source.getDescription());
        ingredient.setMeasurementUnit(muConverter.convert(source.getMeasureUnitCommand()));
        return ingredient;
    }
}
