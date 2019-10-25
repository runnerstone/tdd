package com.lei.learn.tdd.FizzBuzz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzRound1Test {

  @Test
  public void should_see_one_printed() {
    FizzBuzzRound1 fizzBuzzRound1 = new FizzBuzzRound1();
    String res = fizzBuzzRound1.print(1);
    assertThat(res, is("1"));
  }

  @Test
  public void should_see_fizz_printed() {
    FizzBuzzRound1 fizzBuzzRound1 = new FizzBuzzRound1();
    String res = fizzBuzzRound1.print(3);
    assertThat(res, is("Fizz"));
  }

  @Test
  public void should_see_buzz_printed() {
    FizzBuzzRound1 fizzBuzzRound1 = new FizzBuzzRound1();
    String res = fizzBuzzRound1.print(5);
    assertThat(res, is("Buzz"));
  }

  @Test
  public void should_see_fizzbuzz_printed() {
    FizzBuzzRound1 fizzBuzzRound1 = new FizzBuzzRound1();
    String res = fizzBuzzRound1.print(15);
    assertThat(res, is("FizzBuzz"));
  }
}
