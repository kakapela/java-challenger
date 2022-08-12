package training_1.fizz_buzz;

import java.util.stream.IntStream;

public class FizzBuzz {

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100)
                .forEach(number -> {
                    if (number % 3 == 0 && number % 5 == 0)
                        System.out.println("[" + number + "]:" + "FizzBuzz");
                    else if (number % 3 == 0)
                        System.out.println("[" + number + "]:" + "Fizz");
                    else if (number % 5 == 0)
                        System.out.println("[" + number + "]:" + "Buzz");
                });
    }
}
