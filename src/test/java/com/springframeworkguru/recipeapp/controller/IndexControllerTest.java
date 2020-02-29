package com.springframeworkguru.recipeapp.controller;

import com.springframeworkguru.recipeapp.domain.Recipe;
import com.springframeworkguru.recipeapp.repositories.RecipeRepository;
import com.springframeworkguru.recipeapp.service.RecipeService;
import com.springframeworkguru.recipeapp.service.RecipeServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class IndexControllerTest {

    @Mock
    RecipeService recipeService;

    @Mock
    Model model;

    IndexController indexController;

    @BeforeEach
    void setUp() throws Exception{

        MockitoAnnotations.initMocks(this);

        indexController = new IndexController(recipeService);
    }

//    @Test
//    void MockTest() throws Exception{
//        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(indexController).build();
//        mockMvc.perform(get("/")).andExpect(status.isOk()).andExpect(view().name("index"));
//    }

    @Test
    void indexControllerMethod() throws Exception{

        //given
        Set<Recipe> recipes = new HashSet<>();

        Recipe recipe = new Recipe();
        recipe.setId(1L);

        Recipe recipe1 = new Recipe();
        recipe.setId(2L);

        recipes.add(recipe);
        recipes.add(recipe1);

        when(recipeService.getRecipes()).thenReturn(recipes);

        ArgumentCaptor<Set<Recipe>> argumentCaptor = ArgumentCaptor.forClass(Set.class);

        //when
        String viewName = indexController.IndexControllerMethod(model);

        //then
        assertEquals("index", viewName);

        verify(recipeService,times(1)).getRecipes();
        verify(model,times(1)).addAttribute(eq("recipes"), argumentCaptor.capture());

        Set<Recipe> setInController = argumentCaptor.getValue();
        assertEquals(2, setInController.size());
    }

}