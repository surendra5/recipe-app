package com.springframeworkguru.recipeapp.controller;

import com.springframeworkguru.recipeapp.domain.Category;
import com.springframeworkguru.recipeapp.domain.MeasurementUnit;
import com.springframeworkguru.recipeapp.repositories.CategoryRepository;
import com.springframeworkguru.recipeapp.repositories.MeasurementUnitRepository;
import com.springframeworkguru.recipeapp.service.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;
@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/"})
    public String IndexController(Model model){
        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
