package io.github.gabbloquet.tddtraining;

import io.github.gabbloquet.tddtraining.FizzBuzz.FizzBuzz;
import io.github.gabbloquet.tddtraining.FizzBuzz.FizzBuzzCompute;
import io.github.gabbloquet.tddtraining.FizzBuzz.FizzBuzzConverter;
import io.github.gabbloquet.tddtraining.FizzBuzz.IFizzBuzzCompute;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TddTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TddTrainingApplication.class, args);

		IFizzBuzzCompute fizzBuzz = new FizzBuzzCompute();
		String result = fizzBuzz.compute(100);
		System.out.println(result);
	}

}
