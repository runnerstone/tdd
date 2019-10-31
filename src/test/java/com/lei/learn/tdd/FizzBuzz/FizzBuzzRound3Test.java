package com.lei.learn.tdd.FizzBuzz;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FizzBuzzRound3Test {

  @Test
  public void should_see_one_printed() {
    String result = getResult(1);
    assertThat(result, is("1"));
  }

  @Test
  public void should_see_fizz_printed() {
    String result = getResult(9);
    assertThat(result, is("Fizz"));
  }

  private String getResult(int i) {
    FizzBuzzRound3 fizzBuzzRound3 = new FizzBuzzRound3();
    return fizzBuzzRound3.print(i);
  }

  @Test
  public void should_see_buzz_printed() {
    String result = getResult(10);
    assertThat(result, is("Buzz"));
  }

  @Test
  public void should_see_fizz_buzz_printed() {
    String result = getResult(30);
    assertThat(result, is("FizzBuzz"));
  }
}
