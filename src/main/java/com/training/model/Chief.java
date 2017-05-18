package com.training.model;

import com.training.model.factories.*;
import com.training.model.food.meal.Meal;

public class Chief {

    private FactoryOfMeals factoryOfMeals;
    private Meal meal;

    public Chief(FactoryOfMeals factoryOfMeals) {
        this.factoryOfMeals = factoryOfMeals;
    }

    public void setFactoryOfMeals(FactoryOfMeals factoryOfMeals) {
        this.factoryOfMeals = factoryOfMeals;
    }

    public Meal makeMeal(FactoryOfMeals factoryOfMeals){
        this.factoryOfMeals = factoryOfMeals;
        return makeMeal();
    }

    public Meal makeMeal(){
        return factoryOfMeals.getProduct();
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

}
