package com.training.model.factories;


import com.training.model.food.meal.GreekSalad;
import com.training.model.food.meal.Meal;


public class GreekSaladFactory implements FactoryOfMeals {

    @Override
    public Meal getProduct() {
        return new GreekSalad(new TomatoFactory().getProduct(),
                new LettuceLeavesFactory().getProduct(),
                new ChickenBreastFactory().getProduct());
    }

}
