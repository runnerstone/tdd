package com.lei.learn.tdd.FizzBuzz;

public class FizzBuzzRound3 {
  public String print(int num) {
    String result = "";
    if (num % 3 == 0) {
      result += "Fizz";
    }
    if (num % 5 == 0) {
      result += "Buzz";
    }
    if ("".equals(result)) {
      result = String.valueOf(num);
    }
    result = String.valueOf(result);
    return result;
  }
}
