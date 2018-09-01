package java.sort;

public class QuickSort {
    public void sortIntegers2(int[] A) {
        // write your code here
        quick(A, 0, A.length - 1);

    }

    public void quick(int[] A, int start, int end) {
        if (start >= end) {
            return;
        }
        int left = start;
        int right = end;
        int pivot = A[(start + end) / 2];
        while (left <= right) {
            while (left <= right && A[left] < pivot) {
                left++;
            }
            while (left <= right && A[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;
                left++;
                right--;
            }
        }
        quick(A, start, right);
        quick(A, left, end);
    }
}
