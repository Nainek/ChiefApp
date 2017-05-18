package com.training.model.comparators;

import com.training.model.food.Food;


public class ComparatorByProteins implements FoodComparator<Food> {

    @Override
    public int compare(Food o1, Food o2) {
        return ((Integer) o1.getProteins()).compareTo(o2.getProteins());
    }

}