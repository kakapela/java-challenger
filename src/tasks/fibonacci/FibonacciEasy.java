package tasks.fibonacci;

public class FibonacciEasy {

    //0 1 1 2 3 5 8 13 21
    public static int fibonacci(int n){

        if(n <= 1) return n;

        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        for (int i = 2; i <= n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + fibonacci(6));
    }

}
