package com.lei.learn.tdd;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
  @Test
  public void shoud_add_two_number() {
    Calculator calculator = new Calculator();
    int result = calculator.add(1, 2);
    assertThat(result, is(3));
  }
}
