package com.thoughtworks.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class FizzBuzzTest {

    @Test
    void isTimesTest() {

        FizzBuzz fizzBuzz = mock(FizzBuzz.class);
        assertThat(FizzBuzz.isTimes(8,2),is(1));
        assertThat(FizzBuzz.isTimes(12,3),is(1));
        assertThat(FizzBuzz.isTimes(11,1),is(1));
        assertThat(FizzBuzz.isTimes(15,2),is(0));
    }

    @Test
    void getFizzBuzzResultTest() {

        SpecailNumberCreator specailNumberCreator = mock(SpecailNumberCreator.class);
        Integer[] sNums = new Integer[]{5,2,3};
        when(specailNumberCreator.createSpecailNum(100,3)).thenReturn(Arrays.asList(sNums));

        FizzBuzz fizzBuzz = new FizzBuzz(specailNumberCreator,100);

        assertThat(fizzBuzz.getFizzBuzzResult(10),is("FizzBuzz"));
        assertThat(fizzBuzz.getFizzBuzzResult(9),is("Whizz"));
        assertThat(fizzBuzz.getFizzBuzzResult(4),is("Buzz"));
        assertThat(fizzBuzz.getFizzBuzzResult(25),is("Fizz"));
        assertThat(fizzBuzz.getFizzBuzzResult(30),is("FizzBuzzWhizz"));
        assertThat(fizzBuzz.getFizzBuzzResult(11),is("11"));
    }

    @Test
    void code2ResultStringTest() {

        assertThat(FizzBuzz.code2ResultString(1,11),is("Fizz"));
        assertThat(FizzBuzz.code2ResultString(2,11),is("Buzz"));
        assertThat(FizzBuzz.code2ResultString(3,11),is("FizzBuzz"));
        assertThat(FizzBuzz.code2ResultString(4,11),is("Whizz"));
        assertThat(FizzBuzz.code2ResultString(5,11),is("FizzBuzz"));
        assertThat(FizzBuzz.code2ResultString(6,11),is("FizzBuzz"));
        assertThat(FizzBuzz.code2ResultString(0,11),is("11"));
        assertThat(FizzBuzz.code2ResultString(8,11),is("11"));
        assertThat(FizzBuzz.code2ResultString(9,11),is("11"));
    }
}