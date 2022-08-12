package codility.max_counters;

public class Solution {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];

        //N = 3 {0,0,0}
        //A = {2,3,4}

        for (int i = 0; i < A.length; i++) {

            if (A[i] >= 1 && A[i] <= N) {
                int value = A[i];
                counters[value] = counters[value] + 1;
            }
            if (A[i] == N + 1) {
                int value = A[i];
                for (int j = 0; j < N; j++) {
                    counters[j] = value;
                }
            }

            printCounters(counters);
        }


        return null;
    }

    private void printCounters(int[] counters) {
        System.out.print("[ ");
        for (int k = 0; k < counters.length; k++) {
            System.out.print(counters[k] + ", ");
        }
        System.out.println("]");
    }
}
