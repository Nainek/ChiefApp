package com.training.model.factories;


import com.training.model.food.meal.CeasarSalad;
import com.training.model.food.meal.Meal;


public class CeasarSaladFactory  implements FactoryOfMeals {

    @Override
    public Meal getProduct() {
        return new CeasarSalad(new TomatoFactory().getProduct(),
                               new ChickenBreastFactory().getProduct());
    }

}