package com.springframeworkguru.recipeapp.repositories;

import com.springframeworkguru.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;


public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
