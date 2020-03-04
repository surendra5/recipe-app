package com.springframeworkguru.recipeapp.converters;

import com.springframeworkguru.recipeapp.commands.CategoryCommand;
import com.springframeworkguru.recipeapp.domain.Category;
import com.sun.istack.Nullable;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CategoryToCategoryCommand implements Converter<Category, CategoryCommand> {
    @Synchronized
    @Nullable
    @Override
    public CategoryCommand convert(Category source) {
        if(source == null)
            return null;

        final CategoryCommand target = new CategoryCommand();
        target.setId(source.getId());
        target.setDescription(source.getDescription());

        return target;
    }
}
