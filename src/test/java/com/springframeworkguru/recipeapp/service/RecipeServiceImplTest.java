package com.springframeworkguru.recipeapp.service;

import com.springframeworkguru.recipeapp.domain.Recipe;
import com.springframeworkguru.recipeapp.repositories.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class RecipeServiceImplTest {

//    @Mock
//    RecipeRepository recipeRepository;
//
//    RecipeService recipeService;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.initMocks(this);
//        recipeService = new RecipeServiceImpl(recipeRepository, recipeCommandToRecipe, recipeToRecipeCommand);
//    }
//
//    @Test
//    void getRecipes() {
//        Set<Recipe> recipes = new HashSet<>();
//        Recipe recipe = new Recipe();
//        recipe.setId(1L);
//
//        Recipe recipe2 = new Recipe();
//        recipe.setId(2L);
//
//        recipes.add(recipe);
//        recipes.add(recipe2);
//
//        when(recipeRepository.findAll()).thenReturn(recipes);
//
//        Set<Recipe> returnRecipes = new HashSet<>();
//        returnRecipes = recipeService.getRecipes();
//
//        assertEquals(returnRecipes.size(), 2);
//        verify(recipeRepository).findAll();
//        verify(recipeRepository,never()).findById(anyLong());
//    }
//
//    @Test
//    void findById() {
//        Recipe  recipe = new Recipe();
//        recipe.setId(1L);
//
//        when(recipeRepository.findById(anyLong())).thenReturn(Optional.of(recipe));
//
//        assertEquals(1L,recipeService.findById(anyLong()).getId());
////        assertNotNull("Null recipe recived", recipeService.findById(1L));
//        verify(recipeRepository).findById(anyLong());
//        verify(recipeRepository, never()).findAll();
//
//
//    }
}