package com.training;

import com.training.controller.ConsoleController;
import com.training.view.ConsoleView;

public class App {

    public static void main( String[] args ) {

        ConsoleController consoleController = new ConsoleController(new ConsoleView());
        consoleController.processUser();

    }

}



