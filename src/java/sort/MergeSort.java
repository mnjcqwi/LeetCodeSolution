package java.sort;

public class MergeSort {
    public void sortIntegers2(int[] A) {
        // write your code here
        merge(A, new int[A.length], 0, A.length - 1);

    }

    private void merge(int[] a, int[] ints, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        merge(a, ints, start, mid);
        merge(a, ints, mid + 1, end);
        int left = start;
        int right = mid + 1;

        int index = start;
        while (left <= mid && right <= end) {
            if (a[left] < a[right]) {
                ints[index++] = a[left++];
            } else {
                ints[index++] = a[right++];
            }
        }
        while (left <= mid) {
            ints[index++] = a[left++];
        }
        while (right <= end) {
            ints[index++] = a[right++];
        }
        for (int i = start; i <= end; i++) {
            a[i] = ints[i];
        }
    }
}

