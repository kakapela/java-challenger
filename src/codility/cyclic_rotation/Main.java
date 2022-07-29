package codility.cyclic_rotation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] A = {3, 8, 9, 7, 6};
        int[] solution1 = solution.solution(A, 3);
        System.out.println(Arrays.toString(A));

    }
}
