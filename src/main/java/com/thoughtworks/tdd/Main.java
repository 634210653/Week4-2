package com.thoughtworks.tdd;

public class Main {
    public static void main(String[] args) {
        new FizzBuzzGame(new SpecailNumberCreator(),10).startGame();
    }
}
