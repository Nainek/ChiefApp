package com.training.model.factories;

import com.training.model.food.product.ChickenBreast;
import com.training.model.food.Food;


public class ChickenBreastFactory implements FactoryOfProducts {

    @Override
    public Food getProduct() {
        return new ChickenBreast(100,
                                 24,
                                 2,
                                 0);
    }

}
