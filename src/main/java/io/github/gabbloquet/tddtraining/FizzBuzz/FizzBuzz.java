package io.github.gabbloquet.tddtraining.FizzBuzz;

public class FizzBuzz {

    public String compute(int to) {
      IFizzBuzzCompute fizzBuzz = new FizzBuzzCompute();
      return fizzBuzz.compute(to);
    }



  public String convert(int input) {
      IFizzBuzzConverter converter = new FizzBuzzConverter();
      return converter.convert(input);
  }
}

