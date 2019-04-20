package com.thoughtworks.tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class FizzBuzzGameTest {

    @Test
    public void startGameTest(){

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String newline = System.getProperty("line.separator");

        SpecailNumberCreator specailNumberCreator = mock(SpecailNumberCreator.class);
        Integer[] sNums = new Integer[]{2,3,4};
        when(specailNumberCreator.createSpecailNum(5,3)).thenReturn(Arrays.asList(sNums));

        new FizzBuzzGame(specailNumberCreator,5).startGame();

        String str = "1"+newline+"Fizz"+newline+"Buzz"+newline+"FizzBuzz"+newline+"5"+newline;

        Assert.assertEquals(str,outContent.toString());


    }

}