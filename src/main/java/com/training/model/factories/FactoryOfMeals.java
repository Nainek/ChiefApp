package com.training.model.factories;


import com.training.model.food.meal.Meal;

public interface FactoryOfMeals extends FactoryOfProducts{

    @Override
    public Meal getProduct();

}
