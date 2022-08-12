package codility.perm_check;

public class Solution {

    /**
     * Function to check if array is a permutation or not
     *
     * @param A - array contains integers
     * @return 0 if array is not permutation, 1 if array is a permutation
     */
    public int solution(int[] A) {

        int N = A.length;

        int number = 1;

        //sort array first using merge sort
        mergeSort(A, N);


        int result = 1;
        for (int i = 0; i < N; i++) {
            if (A[i] != number) {
                result = 0;
                break;
            }
            number++;
        }
        return result;
    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2)
            return;
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {

            if (l[i] <= r[j])
                a[k++] = l[i++];
            else
                a[k++] = r[j++];

        }

        while (i < left)
            a[k++] = l[i++];

        while (j < right)
            a[k++] = r[j++];
    }
}
