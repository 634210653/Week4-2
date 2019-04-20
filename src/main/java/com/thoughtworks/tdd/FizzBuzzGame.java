package com.thoughtworks.tdd;

import java.util.List;

public class FizzBuzzGame {

    private List<Integer> specailNum = null;
    private FizzBuzz fizzBuzz = null;
    private int humanNumber = 0;

    public FizzBuzzGame(SpecailNumberCreator specailNumberCreator,int humanNumber){
        this.fizzBuzz = new FizzBuzz(specailNumberCreator,humanNumber);
        this.humanNumber = humanNumber;
    }

    public void startGame(){
        for(int i=1;i<=humanNumber;i++){
            System.out.println(fizzBuzz.getFizzBuzzResult(i));
        }
    }
}
