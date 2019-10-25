package com.lei.learn.tdd.FizzBuzz;

public class FizzBuzzRound1 {
  public String print(int i) {

    if (i % 15 == 0) {
      return "FizzBuzz";
    }
    if (i % 3 == 0) {
      return "Fizz";
    }
    if (i % 5 == 0) {
      return "Buzz";
    }

    return String.valueOf(i);
  }
}
