public class rev_arra_pointer {
    public static void rev(int[] arr, int start, int end) {
        int n = arr.length;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        for (int i : arr) {
            System.out.println(i + " ");
        }
        rev(arr, 0, n - 1);
        System.out.println("Reversed array is:");
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }
}
