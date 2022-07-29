package tasks.fizz_buzz;

import java.util.stream.IntStream;

public class FizzBuzz {
    public String solve(int number) {

        IntStream.rangeClosed(1, number)
                .forEach(num->{
                    if( (num % 3 == 0) && (num % 5 == 0) ) System.out.println("FizzBuzz");
                    else if(num % 3 == 0) System.out.println("Fizz");
                    else if (num % 5 == 0) System.out.println("Buzz");
                    else System.out.println(num);
                });




        return null;
    }
}
