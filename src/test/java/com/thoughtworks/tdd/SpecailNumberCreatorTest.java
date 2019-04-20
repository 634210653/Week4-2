package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SpecailNumberCreatorTest {

    @Test
    void createSpecailNumTest() {
        List<Integer> nums = new SpecailNumberCreator().createSpecailNum(100,3);
        nums.forEach(num->assertThat(num>=0&&num<100,is(true)));
        assertThat(nums.size(),is(3));
    }
}