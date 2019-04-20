package com.thoughtworks.tdd;
/***
 * author:LP
 * time:2019.04.20
 */
public class Main {
    public static void main(String[] args) {
        new FizzBuzzGame(new SpecailNumberCreator(),120).startGame();
    }
}
