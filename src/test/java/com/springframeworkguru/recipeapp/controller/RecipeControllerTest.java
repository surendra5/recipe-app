package com.springframeworkguru.recipeapp.controller;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.springframeworkguru.recipeapp.domain.Recipe;
import com.springframeworkguru.recipeapp.service.RecipeService;
import com.springframeworkguru.recipeapp.service.RecipeServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.*;

class RecipeControllerTest {

    @Mock
    RecipeServiceImpl recipeService;

    @Mock
    Model model;

    RecipeController recipeController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        recipeController = new RecipeController(recipeService);
    }

    @Test
    void showById() throws Exception {

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(recipeController).build();

        Recipe recipe = new Recipe();
        recipe.setId(1L);

        when(recipeService.findById(anyLong())).thenReturn(recipe);

        ArgumentCaptor<Recipe> recipeArgumentCaptor = ArgumentCaptor.forClass(Recipe.class);

        mockMvc.perform(get("/recipe/show/1"))
                .andExpect(status().isOk())
                .andExpect(view().name("recipe/show"))
        .andExpect(model().attributeExists("recipe"));


        verify(recipeService).findById(anyLong());
//                verify(model,times(1)).addAttribute(eq("recipe"), recipeArgumentCaptor.capture());
        //        assertEquals(1L, recipeArgumentCaptor.getValue().getId());
    }
}