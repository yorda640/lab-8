package lab8;

import java.util.Arrays;
import java.util.List;

public class Prob4 {


        public static void main(String[] args) {
            List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Cherries", "Plums");

            // Task a: Print using forEach with Lambdas
            fruits.forEach(fruit -> System.out.println(fruit));

            // Task b: Print using method reference
            fruits.forEach(System.out::println);
        }
    }


