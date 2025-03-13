package io.github.gabbloquet.tddtraining.FizzBuzz;

public class FizzBuzzCompute implements IFizzBuzzCompute {
    public String compute(int to) {
        IFizzBuzzConverter converter = new FizzBuzzConverter();
        if(to < 1)
            throw new NonCompliantNumberException();

        StringBuilder transformedString = new StringBuilder();
        for(int i = 1; i <= to; i++){
            transformedString.append(converter.convert(i));
        }

        return transformedString.toString();
    }
}
