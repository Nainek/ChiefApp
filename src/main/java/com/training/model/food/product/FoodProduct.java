package com.training.model.food.product;


import com.training.model.food.Food;

public abstract class FoodProduct extends Food {

    FoodProduct(int weight, int proteinsPerHundredGram, int fatsPerHundredGram, int carbohydratesPerHundredGram) {
        setWeight(weight);
        setNutrients(proteinsPerHundredGram, fatsPerHundredGram, carbohydratesPerHundredGram);
    }

}
