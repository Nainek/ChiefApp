package com.training.model.factories;


import com.training.model.food.Food;
import com.training.model.food.product.LettuceLeaves;

public class LettuceLeavesFactory implements FactoryOfProducts {

    @Override
    public Food getProduct() {
        return new LettuceLeaves(100,
                                 1,
                                 0,
                                 1);
    }

}
