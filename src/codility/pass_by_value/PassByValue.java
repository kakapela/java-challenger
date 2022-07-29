package codility.pass_by_value;

public class PassByValue {
    public static void main(String[] args) {

        int i = 4;
        Passer passer = new Passer();
        passer.changeInt(i);
        System.out.println(i);

        int[] arr = {1,2,3};
        passer.changeArray(arr);

        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.println(arr[i1]);
        }

    }



}
