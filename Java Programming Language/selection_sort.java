// public class selection_sort {
//     public static void main(String[] args) {
//         int arr[] = { 5, 4, 1, 2, 3 };
//         seelction_sort(arr);
//         print(arr);
//     }

//     public static void seelction_sort(int arr[]) {
//         int n = arr.length;
//         int minpos = 0;
//         for (int i = 0; i < n - 1; i++) {
//             int small = arr[0];
//             // System.out.println("Max int value: " + maxInt);
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[j] < small) {
//                     minpos = j;
//                 }
//             }
//             // swap
//             int temp = arr[minpos];
//             arr[minpos] = arr[i];
//             arr[i] = temp;

//         }
//     }

//     public static void print(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i] + " ");
//         }
System.out.println();
//     }
// }
public class selection_sort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 2, 3 };
        selection_sort(arr);
        print(arr);
    }

    public static void selection_sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minpos = i; // Initialize minpos to the current index
            for (int j = i + 1; j < n; j++) { // Loop from i+1 to n (not n-1)
                if (arr[j] < arr[minpos]) { // Compare with arr[minpos]
                    minpos = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp; // Correct the swapping logic
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Use print instead of println for single line output
        }
        System.out.println(); // Print a newline at the end
    }
}
