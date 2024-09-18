public class print_sarray_sum {
    public static void main(String[] args) {
        // int numbers[] = { 2, 4, 6, 8, 10 };
        int numbers[] = { 1, -2, 6, -1, 3 };

        print_subarrays(numbers);
    }

    public static void print_subarrays(int num[]) {
        int ts = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                int sum = 0;
                // for printing and calculating sum
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                    sum += num[k];
                }

                ts++;
                System.out.println("-> Sum: " + sum);
                if (sum > max) {
                    max = sum;
                }
                if (sum < min) {
                    min = sum;
                }
            }
            System.out.println();
        }
        System.out.println("Total subarrays: " + ts);
        System.out.println(max);
        System.out.println(min);
    }
}
