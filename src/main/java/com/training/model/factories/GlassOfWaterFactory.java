package com.training.model.factories;


import com.training.model.food.meal.GlassOfWater;
import com.training.model.food.meal.Meal;
import com.training.model.food.product.Water;


public class GlassOfWaterFactory  implements FactoryOfMeals {

    @Override
    public Meal getProduct() {
        return new GlassOfWater(new Water(200, 0, 0, 0));
    }

}