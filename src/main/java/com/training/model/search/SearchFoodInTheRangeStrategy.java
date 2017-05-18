package com.training.model.search;

import com.training.model.food.Food;
import java.util.List;


public interface SearchFoodInTheRangeStrategy<T> {

    List<T> findFoodInTheSpecifiedRange(List<T> ingtrdients, int start, int end);

}
