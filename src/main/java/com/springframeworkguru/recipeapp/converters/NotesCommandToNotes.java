package com.springframeworkguru.recipeapp.converters;

import com.springframeworkguru.recipeapp.commands.NotesCommand;
import com.springframeworkguru.recipeapp.domain.Notes;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class NotesCommandToNotes implements Converter<NotesCommand, Notes> {

    @Synchronized
    @Nullable
    @Override
    public Notes convert(NotesCommand source) {
        if(source == null) {
            return null;
        }

        final Notes notes = new Notes();
        notes.setId(source.getId());
        notes.setNote(source.getRecipeNotes());
        return notes;
    }
}
