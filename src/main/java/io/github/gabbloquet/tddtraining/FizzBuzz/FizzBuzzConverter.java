package io.github.gabbloquet.tddtraining.FizzBuzz;

public class FizzBuzzConverter implements IFizzBuzzConverter {
  public String convert(int input) {
    if(input % 15 == 0){
      return "FizzBuzz";
    } else if(input % 5 == 0) {
      return "Buzz";
    } else if(input % 3 == 0){
      return "Fizz";
    }
    return String.valueOf(input);
  }
}
