import java.util.Arrays;

public class chocolate_dist_pro {
    public static void main(String[] args) {
        int m;
        int arr[] = { 12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50 };
        int result = mindiff(arr, 7);
        // Print the result or indicate an invalid input
        if (result != -1) {
            System.out.println("Minimum difference is " + result);
        } else {
            System.out.println("Invalid input");
        }

    }

    public static int mindiff(int arr[], int num) {
        int n = arr.length - 1;
        int min_diff = Integer.MAX_VALUE;
        // base case
        if (n <= 0 && num < 0) {
            return 0;
        }
        // if num is not sufficient
        if (n < num) {
            return -1;
        }
        Arrays.sort(arr);
        int mindiff = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int idx = i + num - 1;
            if (idx >= arr.length) {
                break;
            }
            int mindiffr = arr[idx] - arr[i];
            min_diff = Math.min(min_diff, mindiffr);
        }
        return min_diff;
    }
}
