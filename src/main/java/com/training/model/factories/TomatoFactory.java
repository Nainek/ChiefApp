package com.training.model.factories;

import com.training.model.food.Food;
import com.training.model.food.product.Tomato;

public class TomatoFactory implements FactoryOfProducts {

    @Override
    public Food getProduct() {
        return new Tomato(100,
                          1,
                          0,
                          4);
    }


}
