package com.example.recipe;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.recipe.RecipeService;
import com.example.recipe.Recipe;
/*
 * You can use the following import statements
 * 
 * 
 * 
 */

// Write your code here.
@RestController
public class RecipeController {
    RecipeService recipeService = new RecipeService();

    @DeleteMapping("/recipes/{recipeId}")
    public void deleteRecipe(@PathVariable int recipeId) {
        recipeService.deleteRecipe(recipeId);
    }

    @PutMapping("/recipes/{recipeId}")
    public Recipe updateRecipe(@PathVariable("recipeId") int recipeId, @RequestBody Recipe recipe) {
        return recipeService.updateRecipe(recipeId, recipe);
    }

    @PostMapping("/recipes")
    public Recipe addRecipe(@RequestBody Recipe recipe) {
        return recipeService.addRecipe(recipe);
    }

    @GetMapping("/recipes")
    public ArrayList<Recipe> getRecipes() {
        return recipeService.getRecipes();
    }

    @GetMapping("/recipes/{recipeId}")
    public Recipe getRecipeById(@PathVariable("recipeId") int recipeId) {
        return recipeService.getRecipeById(recipeId);
    }
}