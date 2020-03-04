package com.springframeworkguru.recipeapp.converters;

import com.springframeworkguru.recipeapp.commands.MeasureUnitCommand;
import com.springframeworkguru.recipeapp.domain.MeasurementUnit;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class MeasurementUnitCommandToMeasurementUnit implements Converter<MeasureUnitCommand, MeasurementUnit> {

    @Synchronized
    @Nullable
    @Override
    public MeasurementUnit convert(MeasureUnitCommand source) {
        if (source == null) {
            return null;
        }

        final MeasurementUnit mu = new MeasurementUnit();
        mu.setId(source.getId());
        mu.setDescription(source.getDescription());
        return mu;
    }
}
