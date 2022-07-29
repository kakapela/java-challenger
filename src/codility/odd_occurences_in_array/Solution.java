package codility.odd_occurences_in_array;


import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

//{9,3,9,3,9,7,9}
class Solution {

    /**
     * @param A
     * @return
     */
    public int solution(int[] A) {

        int[] B = sort(A);
        int unpairedNumber = 0;

        for (int i = 0; i < B.length; i++) {
            int checkpoint = 0;
            int cachedNumber = B[i];

            for (int n = 0; n < B.length; n++) {
                if (cachedNumber == B[n]) {
                    checkpoint++;
                }
            }

            if (checkpoint < 2) {
                unpairedNumber = cachedNumber;
            }
        }

        return unpairedNumber;
    }

    public int[] sort(int arr[]) {
        buildHeap(arr);
        for (int i = arr.length-1; i > 0; i--) {
            swap(arr, 0, i);
            buildMaxHeap(arr, 0, i-1);
        }
        return arr;
    }
    /* Budujemy stertę */
    public static void buildHeap(int arr[]) {
        for (int i = (arr.length-1)/2; i >= 0; i--){
            buildMaxHeap(arr, i, arr.length-1);
        }
    }
    /* Podmieniamy największy element w stercie */
    public static void buildMaxHeap(int arr[], int i, int N) {
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= N && arr[left] > arr[i]) {
            max = left;
        }
        if (right <= N && arr[right] > arr[max]) {
            max = right;
        }
        if (max != i) {
            swap(arr, i, max);
            buildMaxHeap(arr, max, N);
        }
    }
    /* Zamieniamy dwa elementy w tablicy */
    public static void swap(int arr[], int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
