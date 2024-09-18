public class print_subarrays {
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        print_subarrays(numbers);
    }

    public static void print_subarrays(int num[]) {
        int ts = 0;
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                // for printing
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");

                }

                ts++;

                // int sum=sum_of_array(num[ ]);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(ts);
    }
}