package com.training.model.food.meal;

import com.training.model.comparators.*;
import com.training.model.food.Food;
import com.training.model.search.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public abstract class Meal extends Food {

    private List<Food> ingredients = new LinkedList<Food>();
    private FoodComparator comparator = new ComparatorByCarbohydrates();
    private SearchFoodInTheRangeStrategy  searchStrategy = new SearchFoodInTheSpecifiedRangeOfProteins();

    private int kilocalories;
    private int fats;
    private int proteins;
    private int carbohydrates;


    Meal(Food...foods) {

        for (Food food : foods) {
            addIngridient(food);
        }
        calculateNutrients();
    }

    private void calculateWeight() {
        int weight = 0;
        for (Food ingredient : ingredients) {
            weight += ingredient.getWeight();
        }
        this.setWeight(weight);
    }

    private void calculateNutrients() {
        calculateCarbohydrates();
        calculateFats();
        calculateProteins();
        calculateKilocalories();
        calculateWeight();
    }

    private void calculateCarbohydrates() {
        int carbohydrates = 0;
        for (Food ingredient : ingredients) {
            carbohydrates += ingredient.getCarbohydrates();
        }
        this.carbohydrates = carbohydrates;
    }

    private void calculateProteins() {
        int proteins = 0;
        for (Food ingredient : ingredients) {
            proteins += ingredient.getProteins();
        }
        this.proteins = proteins;
    }

    private void calculateFats() {
        int fats = 0;
        for (Food ingredient : ingredients) {
            fats += ingredient.getFats();
        }
        this.fats = fats;
    }

    private void calculateKilocalories() {
        int kilocalories = 0;
        for (Food ingredient : ingredients) {
            kilocalories += ingredient.getKilocalories();
        }
        this.kilocalories = kilocalories;
    }

    public List<Food> getIngredientsInRange(int startRange, int endRange){
        return  searchStrategy.findFoodInTheSpecifiedRange(ingredients, startRange, endRange);
    }

    public void sortIngredients(){
        Collections.sort(ingredients, comparator);
    }

    public SearchFoodInTheRangeStrategy getSearchStrategy() {
        return searchStrategy;
    }

    public void setSearchStrategy(SearchFoodInTheRangeStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }

    public List<Food> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Food> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngridient(Food food){
        ingredients.add(food);
    }

    @Override
    public int getKilocalories() {
        return kilocalories;
    }

    @Override
    public int getFats() {
        return fats;
    }

    @Override
    public int getProteins() {
        return proteins;
    }

    @Override
    public int getCarbohydrates() {
        return carbohydrates;
    }

    public FoodComparator getComparator() {
        return comparator;
    }

    public void setComparator(FoodComparator comparator) {
        this.comparator = comparator;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " {" +
                "Ingredients=" + ingredients +
                ", kcal=" + kilocalories +
                ", p=" + proteins +
                ", f=" + fats +
                ", c=" + carbohydrates +
                '}';
    }

}
