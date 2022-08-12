package training_1.prime_number;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.IntStream;

public class Solution {

    // np. 10
    public static boolean isPrimeNumber(int n){
        if (n < 1) return false;

        AtomicBoolean b = new AtomicBoolean(true);

        IntStream.range(2, n)
                .forEach(i->{
                    if(n % i == 0) {
                        b.set(false);
                    }
                });

        return b.get();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if(isPrimeNumber(i))
                System.out.println(i);
//            System.out.println("["+i+"] - " + isPrimeNumber(i));

        }
    }
}
