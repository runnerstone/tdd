package com.lei.learn.tdd.FizzBuzz;

public class FizzBuzzRound2 {
  public String print(int num) {

    if (num % 15 == 0) {
      return "FizzBuzz";
    }
    if (num % 3 == 0) {
      return "Fizz";
    }
    if (num % 5 == 0) {
      return "Buzz";
    }
    return String.valueOf(num);
  }
}
