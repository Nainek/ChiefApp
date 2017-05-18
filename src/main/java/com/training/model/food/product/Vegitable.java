package com.training.model.food.product;


public abstract class Vegitable extends FoodProduct {

    Vegitable(int weight, int proteinsPerHundredGram, int fatsPerHundredGram, int carbohydratesPerHundredGram) {
        super(weight, proteinsPerHundredGram, fatsPerHundredGram, carbohydratesPerHundredGram);
    }

}
