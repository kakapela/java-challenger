package codility.missing_integer;

import java.util.TreeSet;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toCollection;

public class Solution {

    /**
     * Return smallest element that do not occur in an array
     *
     * @param A
     * @return - smallest element that do not exitsts in array
     */
    public static int solution(int[] A) {

//        mergeSort(A, 0, N - 1);

//        if (A[N - 1] <= 0)
//            return 1;

        TreeSet<Integer> set = stream(A)
                .boxed()
                .collect(toCollection(TreeSet::new));

        if(set.last() <= 0) return 1;

        int tmp = 1;
        for (Integer number : set) {
            if(number<=0)
                continue;
            else if(number==tmp)
                tmp++;
            else
                break;
        }

        return tmp;
    }
/*
    // Merge two sub arrays L and M into array
    public static void merge(int array[], int p, int q, int r) {

        int n1 = q - p + 1;
        int n2 = r - q;

        int L[] = new int[n1];
        int M[] = new int[n2];

        // fill the left and right array
        for (int i = 0; i < n1; i++)
            L[i] = array[p + i];
        for (int j = 0; j < n2; j++)
            M[j] = array[q + 1 + j];

        // Maintain current index of sub-arrays and main array
        int i, j, k;
        i = 0;
        j = 0;
        k = p;

        // Until we reach either end of either L or M, pick larger among
        // elements L and M and place them in the correct position at A[p..r]
        // for sorting in descending
        // use if(L[i] >= <[j])
        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = M[j];
                j++;
            }
            k++;
        }

        // When we run out of elements in either L or M,
        // pick up the remaining elements and put in A[p..r]
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = M[j];
            j++;
            k++;
        }
    }

    // Divide the array into two sub arrays, sort them and merge them
    public static void mergeSort(int array[], int left, int right) {
        if (left < right) {

            // m is the point where the array is divided into two sub arrays
            int mid = (left + right) / 2;

            // recursive call to each sub arrays
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            // Merge the sorted sub arrays
            merge(array, left, mid, right);
        }
    }*/

    public static void main(String[] args) {

        int[] B = new int[200];
        for (int i = 0; i <= 100; i++) {
            B[i] = i;
        }

        for (int i = 101; i < B.length; i++) {
            B[i] = i+1;
        }

        System.out.println("Solution: " + solution(new int[]{1,2,3}));

    }
}
