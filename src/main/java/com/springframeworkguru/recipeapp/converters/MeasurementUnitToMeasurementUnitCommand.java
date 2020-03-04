package com.springframeworkguru.recipeapp.converters;

import com.springframeworkguru.recipeapp.commands.MeasureUnitCommand;
import com.springframeworkguru.recipeapp.domain.MeasurementUnit;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class MeasurementUnitToMeasurementUnitCommand implements Converter<MeasurementUnit, MeasureUnitCommand> {

    @Synchronized
    @Nullable
    @Override
    public MeasureUnitCommand convert(MeasurementUnit source) {
        if (source == null) {
            return null;
        }

        final MeasureUnitCommand muC = new MeasureUnitCommand();
        muC.setId(source.getId());
        muC.setDescription(source.getDescription());
        return muC;
    }
}
