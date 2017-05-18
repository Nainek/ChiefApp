package com.training.model.comparators;

import com.training.model.food.Food;


public class ComparatorByFats implements FoodComparator<Food> {

    @Override
    public int compare(Food o1, Food o2) {
        return ((Integer) o1.getFats()).compareTo(o2.getFats());
    }

}