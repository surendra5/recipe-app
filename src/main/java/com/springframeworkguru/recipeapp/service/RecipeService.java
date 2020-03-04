package com.springframeworkguru.recipeapp.service;

import com.springframeworkguru.recipeapp.commands.RecipeCommand;
import com.springframeworkguru.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
    Recipe findById(Long id);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
