package com.training.controller;


import com.training.model.Chief;
import com.training.model.factories.*;
import com.training.model.food.meal.Meal;

public class ChiefController {

    private Chief saladChief = new Chief(new GlassOfWaterFactory());


    void createMeal(){
        saladChief.setMeal(saladChief.makeMeal());
    }

    Chief getSaladChief() {
        return saladChief;
    }

    public Meal getMeal() {
        return saladChief.getMeal();
    }

    public void setSaladChief(Chief saladChief) {
        this.saladChief = saladChief;
    }

    public void setMeal(Meal meal) {
        saladChief.setMeal(meal);
    }
}
