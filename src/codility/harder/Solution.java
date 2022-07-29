package codility.harder;


class Solution {

    //{3,1,2,4,3} -> returns 1
    public int solution(int[] A) {
//        mergeSort(A,A.length);
        int N = A.length;

        //P - from 1 to N-1 -> for example P=1, P=2, P=3, P=4

        //lets start with assuming P=1

        int diff = Integer.MAX_VALUE;
        for (int p = 1; p < N; p++) {

            int firstSet = 0;
            int secondSet = 0;
            int tmpResult = 0;

            for (int i = 0; i < N; i++) {

                if (i < p) {
                    firstSet = firstSet + A[i];
                } else
                    secondSet = secondSet + A[i];
            }
            tmpResult = Math.abs(firstSet - secondSet);
//            System.out.println("P = "+ p + " | diff: " + tmpResult);

            if (tmpResult < diff)
                diff = tmpResult;

        }
        return diff;
    }

    public static void merge(int[] left_arr, int[] right_arr, int[] arr, int left_size, int right_size) {

        int i = 0, l = 0, r = 0;
        //The while loops check the conditions for merging
        while (l < left_size && r < right_size) {

            if (left_arr[l] < right_arr[r]) {
                arr[i++] = left_arr[l++];
            } else {
                arr[i++] = right_arr[r++];
            }
        }
        while (l < left_size) {
            arr[i++] = left_arr[l++];
        }
        while (r < right_size) {
            arr[i++] = right_arr[r++];
        }
    }

    public static void mergeSort(int[] arr, int len) {
        if (len < 2) {
            return;
        }

        int mid = len / 2;
        int[] left_arr = new int[mid];
        int[] right_arr = new int[len - mid];

        //Dividing array into two and copying into two separate arrays
        int k = 0;
        for (int i = 0; i < len; ++i) {
            if (i < mid) {
                left_arr[i] = arr[i];
            } else {
                right_arr[k] = arr[i];
                k = k + 1;
            }
        }
        // Recursively calling the function to divide the subarrays further
        mergeSort(left_arr, mid);
        mergeSort(right_arr, len - mid);
        // Calling the merge method on each subdivision
        merge(left_arr, right_arr, arr, mid, len - mid);
    }

}
