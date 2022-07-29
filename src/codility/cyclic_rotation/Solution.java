package codility.cyclic_rotation;

public class Solution {

    // int[] A =  {3 ,4 ,5, 6, 7};
    // 7, 3, 4, 5, 6
    public int[] solution(int[] A, int K) {

        int N = A.length;

        /**
         * N and K are integers within the range [0..100];
         */
        if ((N >= 0 && N <= 100) && (K >= 0 && K <= 100)) {

            for (int j = 0; j < K; j++) {
                int tmp1 = 0, tmp2 = 0;
                //one time
                for (int i = 0; i < N; i++) {

                    if (i == 0) {
                        tmp1 = A[i];
                        A[i] = A[N - 1];
                    } else {
                        if (i % 2 != 0) {
                            tmp2 = A[i];
                            A[i] = tmp1;
                        } else {
                            tmp1 = A[i];
                            A[i] = tmp2;
                        }
                    }
                }
//                System.out.println(Arrays.toString(A));
            }
            return A;
        }
        return null;
    }


}
