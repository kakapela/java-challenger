package tasks.power;

public class PowerFunction {

    // x * x * x * x
    public static int power(int x, int y){

        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(power(1,4));
    }
}
