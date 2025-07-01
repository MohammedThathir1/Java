// Binary Search only done on sorted array:

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 6, 2147483644, 2147483645, 2147483646, 2147483647 };
        System.out.println("Index : " + search(arr, 4));

        // In-built Method for binarySearch:
        System.out.println(Arrays.binarySearch(arr, 4));
    }

    public static int search(int[] arr, int element) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // int mid = (start+end) /2; this condition not handle Integer.MAX_VALUE that
            // why we use this:
            int mid = start + (end - start) / 2; // (2start + end - start)/2 => (start+end) /2

            if (arr[mid] < element) {
                start = mid + 1;

            } else if (arr[mid] > element) {
                end = mid - 1;

            } else {
                return mid;
            }
        }
        return -1;

    }
}
