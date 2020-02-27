package com.springframeworkguru.recipeapp.service;

import com.springframeworkguru.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
