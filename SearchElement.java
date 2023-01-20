package src.LinearSearch;

public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {18, 12, 9, 14, 77, 50, -1, 32, 12, 45};
        int target = -6;

        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }

        return -1;
    }
}
