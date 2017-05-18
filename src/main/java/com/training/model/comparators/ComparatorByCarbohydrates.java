package com.training.model.comparators;

import com.training.model.food.Food;

public class ComparatorByCarbohydrates implements FoodComparator<Food> {

    @Override
    public int compare(Food o1, Food o2) {
        return ((Integer)o1.getCarbohydrates()).compareTo(o2.getCarbohydrates());
    }

}