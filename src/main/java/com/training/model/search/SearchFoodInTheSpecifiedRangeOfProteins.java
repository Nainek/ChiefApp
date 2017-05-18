package com.training.model.search;

import com.training.model.food.Food;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SearchFoodInTheSpecifiedRangeOfProteins implements SearchFoodInTheRangeStrategy<Food> {

    private int startRange = 0;
    private int endRange = 0;

    @Override
    public List<Food> findFoodInTheSpecifiedRange(List<Food> ingtrdients, int start, int end) {

        List<Food> resultListOfProducts = new LinkedList<Food>();

        correctRange(start, end);
        setRange(start,end);

        Iterator <Food> it = ingtrdients.iterator();
        if(it.hasNext()){
            Food temporaryIngredientForComparison = it.next();
            if(checkIfProductMeetsTheRequirements(temporaryIngredientForComparison)){
                resultListOfProducts.add(temporaryIngredientForComparison);
            }
        }

        return resultListOfProducts;
    }

    private void correctRange( int start, int end){
        if(start > end){
            int temporaryIntForSwopeVariables;
            temporaryIntForSwopeVariables = start;
            start = end;
            end = temporaryIntForSwopeVariables;
        }
    }

    private void setRange(int start, int end){
        startRange = start;
        endRange = end;
    }

    private boolean checkIfProductMeetsTheRequirements(Food food) {
        return (food.getProteins() >= startRange && food.getProteins() <= endRange);
    }



}
