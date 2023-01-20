package src.BinarySearch;

public class SearchBinary {
    public static void main(String[] args) {
        int[] arr = {-12, -11, 0, 1, 4, 5, 7, 8, 23, 54, 67};
        int target = -12;

        int mid = search(arr, target);
        System.out.println(mid);
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
