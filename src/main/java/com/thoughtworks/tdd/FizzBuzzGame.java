package com.thoughtworks.tdd;

import java.util.List;

public class FizzBuzzGame {

    private List<Integer> specailNum = null;
    private FizzBuzz fizzBuzz = null;
    private int humanNumber = 0;

    public FizzBuzzGame(FizzBuzz fizzBuzz,int humanNumber){
        this.fizzBuzz = fizzBuzz;
        this.specailNum = fizzBuzz.createSpecailNum(humanNumber);
        this.humanNumber = humanNumber;
    }

    public void startGame(){

        for(int i=0;i<humanNumber;i++){

        }

    }
}
