package com.training.model.comparators;


import com.training.model.food.Food;
import java.util.Comparator;

public interface FoodComparator<T> extends Comparator<T> {
    int compare(Food o1, Food o2);
}
