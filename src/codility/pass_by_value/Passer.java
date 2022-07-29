package codility.pass_by_value;

public class Passer {

    public void changeInt(int i){
        i = 10;
    }

    public void changeArray(int[] arr){
        arr[0] = 999;
    }
}
