package com.lei.learn.tdd.FizzBuzz;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FizzBuzzRound3Test {

  @Test
  public void should_see_one_printed() {
    FizzBuzzRound3 fizzBuzzRound3 = new FizzBuzzRound3();
    String result = fizzBuzzRound3.print(1);
    assertThat(result, is("1"));
  }

  @Test
  public void should_see_fizz_printed() {
    FizzBuzzRound3 fizzBuzzRound3 = new FizzBuzzRound3();
    String result = fizzBuzzRound3.print(9);
    assertThat(result, is("Fizz"));
  }

  @Test
  public void should_see_buzz_printed() {
    FizzBuzzRound3 fizzBuzzRound3 = new FizzBuzzRound3();
    String result = fizzBuzzRound3.print(10);
    assertThat(result, is("Buzz"));
  }

  @Test
  public void should_see_fizz_buzz_printed() {
    FizzBuzzRound3 fizzBuzzRound3 = new FizzBuzzRound3();
    String result = fizzBuzzRound3.print(30);
    assertThat(result, is("FizzBuzz"));
  }
}
