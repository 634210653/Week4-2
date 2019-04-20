package com.thoughtworks.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class FizzBuzzTest {

    @Test
    void isTimesTest() {

        assertThat(FizzBuzz.getInstance().isTimes(8,2),is(true));
        assertThat(FizzBuzz.getInstance().isTimes(12,3),is(true));
        assertThat(FizzBuzz.getInstance().isTimes(11,1),is(true));
        assertThat(FizzBuzz.getInstance().isTimes(15,2),is(false));
    }


    @Test
    void createSpecailNumTest() {

        List<Integer> nums = FizzBuzz.getInstance().createSpecailNum(100);
        nums.forEach(num->assertThat(num>=0&&num<100,is(true)));
        assertThat(nums.size(),is(3));
    }

}