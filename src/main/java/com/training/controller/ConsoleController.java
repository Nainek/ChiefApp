package com.training.controller;


import com.training.model.factories.*;
import com.training.model.search.*;
import com.training.view.*;

import java.util.Scanner;

public class ConsoleController {

    private ConsoleView consoleView = new ConsoleView();
    private ChiefController chiefController = new ChiefController();

    private SearchFoodInTheRangeStrategy typeOfSearch = new SearchFoodInTheSpecifiedRangeOfProteins();

    public ConsoleController(ConsoleView consoleView) {
        this.consoleView = consoleView;
    }

    public void processUser(){

        Scanner sc = new Scanner(System.in);
        int orderNumber = 0;

        consoleView.printGreetingMessage();
        consoleView.printOfferMessage();

        orderNumber = getNumberOfTheCustomerOrder(sc);
        giveCustomersOrderToTheChief(orderNumber);

        chiefController.createMeal();
        chiefController.setMeal(chiefController.getMeal());

        consoleView.printDescriptionAboutFood(chiefController.getMeal().toString());

    }


    private int getNumberOfTheCustomerOrder(Scanner sc) {
        int res = 0;

        // check int - value
        while (!sc.hasNextInt()) {
            consoleView.printWrongIntInput();
            sc.next();
        }
        res = sc.nextInt();

        return res;
    }

    private void giveCustomersOrderToTheChief(int numberOfProductInMenu){
        switch(numberOfProductInMenu){
            case 1: {
                chiefController.getSaladChief().setFactoryOfMeals(new GreekSaladFactory());
                break;
            }
            case 2: {
                chiefController.getSaladChief().setFactoryOfMeals(new CeasarSaladFactory());
                break;
            }
            default: {
                chiefController.getSaladChief().setFactoryOfMeals(new GlassOfWaterFactory());
                break;
            }
        }
    }

    public ChiefController getChiefController() {
        return chiefController;
    }

    public void setChiefController(ChiefController chiefController) {
        this.chiefController = chiefController;
    }

    public SearchFoodInTheRangeStrategy getTypeOfSearch() {
        return typeOfSearch;
    }

    public void setTypeOfSearch(SearchFoodInTheRangeStrategy typeOfSearch) {
        this.typeOfSearch = typeOfSearch;
    }

}
