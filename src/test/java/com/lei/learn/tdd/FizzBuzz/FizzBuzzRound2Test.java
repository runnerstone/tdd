package com.lei.learn.tdd.FizzBuzz;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FizzBuzzRound2Test {

  @Test
  public void should_see_one_printed() {
    FizzBuzzRound2 fizzBuzzRound2 = new FizzBuzzRound2();
    String result = fizzBuzzRound2.print(1);
    assertThat(result, is("1"));
  }

  @Test
  public void should_see_fizz_printed() {
    FizzBuzzRound2 fizzBuzzRound2 = new FizzBuzzRound2();
    String result = fizzBuzzRound2.print(6);
    assertThat(result, is("Fizz"));
  }

  @Test
  public void should_see_buzz_printed() {
    FizzBuzzRound2 fizzBuzzRound2 = new FizzBuzzRound2();
    String result = fizzBuzzRound2.print(10);
    assertThat(result, is("Buzz"));
  }
  @Test
  public void should_see_fizzbuzz_printed(){
    FizzBuzzRound2 fizzBuzzRound2 = new FizzBuzzRound2();
    String result = fizzBuzzRound2.print(30);
    assertThat(result,is("FizzBuzz"));
  }
}
