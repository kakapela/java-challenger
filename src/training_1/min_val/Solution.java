package training_1.min_val;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Solution {

    public static int solution(int[] A, int[] B){

        int result = Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int tmp;
                if(A[i] < B[j])
                    tmp = B[j] - A[i];
                else
                    tmp = A[i] - B[j];
                if(result > tmp)
                    result = tmp;
            }
        }
            return result;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 15, 11, 2};
        int[] B = {23, 27, 235, 19, 8};
        System.out.println(solution(A, B));
    }
}
