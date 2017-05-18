package com.training.model.food;


import com.training.GlobalConstants;

public abstract class Food {

    private int weight;

    private int kilocaloriesPerHundredGram;
    private int fatsPerHundredGram;
    private int proteinsPerHundredGram;
    private int carbohydratesPerHundredGram;

    public void setNutrients(int proteinsPerHundredGram, int fatsPerHundredGram, int carbohydratesPerHundredGram){
        this.proteinsPerHundredGram = proteinsPerHundredGram;
        this.fatsPerHundredGram = fatsPerHundredGram;
        this.carbohydratesPerHundredGram = carbohydratesPerHundredGram;
        kilocaloriesPerHundredGram = getKilocaloriesPerHundredGram();
    }

    private int getKilocaloriesPerHundredGram(){
         return fatsPerHundredGram * GlobalConstants.KILOCALORIES_IN_ONE_GRAMM_OF_FAT
                 + carbohydratesPerHundredGram * GlobalConstants.KILOCALORIES_IN_ONE_GRAMM_OF_CARBOHYDRATE
                 + proteinsPerHundredGram * GlobalConstants.KILOCALORIES_IN_ONE_GRAMM_OF_PROTEIN;
    }

    public int getFatsPerHundredGram() {
        return fatsPerHundredGram;
    }

    public int getProteinsPerHundredGram() {
        return proteinsPerHundredGram;
    }

    public int getCarbohydratesPerHundredGram() {
        return carbohydratesPerHundredGram;
    }

    public int getKilocalories(){
        return (kilocaloriesPerHundredGram * weight)/ GlobalConstants.HUNDRED_GRAMM;

    }

    public int getFats(){
        return (fatsPerHundredGram * weight)/ GlobalConstants.HUNDRED_GRAMM;
    }

    public int getProteins(){
        return (proteinsPerHundredGram * weight)/ GlobalConstants.HUNDRED_GRAMM;
    }

    public int getCarbohydrates(){
        return (carbohydratesPerHundredGram * weight)/ GlobalConstants.HUNDRED_GRAMM;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  this.getClass().getSimpleName() +
                "{" +
                "weight=" + weight +
                ", kcal=" + kilocaloriesPerHundredGram +
                ", p=" + proteinsPerHundredGram +
                ", f=" + fatsPerHundredGram +
                ", c=" + carbohydratesPerHundredGram +
                '}';
    }

}
