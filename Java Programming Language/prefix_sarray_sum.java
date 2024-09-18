public class prefix_sarray_sum {
    public static void main(String args[]) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        int prefix_array[] = new int[numbers.length];

        // Calculating the prefix array sum
        prefix_array[0] = numbers[0];
        for (int i = 1; i < prefix_array.length; i++) { // Start from 1
            prefix_array[i] = prefix_array[i - 1] + numbers[i];
        }

        int sum = print_sarray_sum(prefix_array, numbers);
        System.out.println(sum);
    }

    public static int print_sarray_sum(int prefix[], int num[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {

                currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (currsum > maxsum) {
                    maxsum = currsum;
                }
            }
        }

        return maxsum;
    }
}
