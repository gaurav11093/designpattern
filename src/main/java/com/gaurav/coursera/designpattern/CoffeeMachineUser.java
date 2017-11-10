package com.gaurav.coursera.designpattern;

public class CoffeeMachineUser {

    public static void main(String[] args) {
        OldCoffeeMachine oldCoffeeMachine = new OldCoffeeMachine();
        CoffeeMachineInterface coffeeMachine = new CoffeeTouchscreenAdapter(oldCoffeeMachine);
        coffeeMachine.chooseFirstSelection();
        coffeeMachine.chooseSecondSelection();
    }
}
