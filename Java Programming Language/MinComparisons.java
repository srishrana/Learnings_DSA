import java.util.Scanner;

public class MinComparisons {
    public static void minmax(int[] num) {
        if (num == null || num.length == 0) {
            System.out.println("Array is empty or null!");
            return;
        }

        int n = num.length;
        int min, max;

        if (n % 2 == 0) {
            // Even number of elements
            if (num[0] > num[1]) { // 1st comparison
                max = num[0];
                min = num[1];
            } else {
                max = num[1];
                min = num[0];
            }

            // Start from the third element
            for (int i = 2; i < n; i += 2) {
                if (i + 1 < n) { // Ensure we do not go out of bounds
                    if (num[i] > num[i + 1]) { // 2nd comparison
                        if (num[i] > max) {
                            max = num[i];
                        }
                        if (num[i + 1] < min) { // 3rd comparison
                            min = num[i + 1];
                        }
                    } else {
                        if (num[i + 1] > max) {
                            max = num[i + 1];
                        }
                        if (num[i] < min) {
                            min = num[i];
                        }
                    }
                } else { // Handle the case when there is an odd number of elements left
                    if (num[i] > max) {
                        max = num[i];
                    }
                    if (num[i] < min) {
                        min = num[i];
                    }
                }
            }
        } else {
            // Odd number of elements
            min = max = num[0];
            for (int i = 1; i < n; i += 2) {
                if (i + 1 < n) { // Ensure we do not go out of bounds
                    if (num[i] > num[i + 1]) {
                        if (num[i] > max) {
                            max = num[i];
                        }
                        if (num[i + 1] < min) {
                            min = num[i + 1];
                        }
                    } else {
                        if (num[i + 1] > max) {
                            max = num[i + 1];
                        }
                        if (num[i] < min) {
                            min = num[i];
                        }
                    }
                } else { // Handle the last single element
                    if (num[i] > max) {
                        max = num[i];
                    }
                    if (num[i] < min) {
                        min = num[i];
                    }
                }
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Array size must be positive.");
            return;
        }
        int[] num = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.println(num[i]);
        }
        minmax(num);
    }
}
