package com.lei.learn.tdd.FizzBuzz;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzRound2Test {

    @Test
    public void should_see_one_printed() {
        FizzBuzzRound2 fizzBuzzRound2 = new FizzBuzzRound2();
        String result = fizzBuzzRound2.print(1);
        assertThat(result, is("1"));
    }
}
