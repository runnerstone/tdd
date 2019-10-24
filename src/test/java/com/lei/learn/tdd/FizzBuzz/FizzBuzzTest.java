package com.lei.learn.tdd.FizzBuzz;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FizzBuzzTest {

  @Test
  public void should_see_one_print() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    String result = fizzBuzz.print(1);
    assertThat(result, is("1"));
  }

  @Test
  public void should_see_fizz_print() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    String result = fizzBuzz.print(3);
    assertThat(result, is("Fizz"));
  }

  @Test
  public void should_see_buzz_print() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    String result = fizzBuzz.print(5);
    assertThat(result, is("Buzz"));
  }

  @Test
  public void should_see_fizzbuzz_print() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    String result = fizzBuzz.print(15);
    assertThat(result, is("FizzBuzz"));
  }
}