public class kadanealgo {

    public static void main(String[] args) {
        int numbers[] = { -1, -2, -3, -4 };
        kadane(numbers);

    }

    public static void kadane(int numbers[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            currsum = currsum + numbers[i];
            if (currsum < 0) {
                currsum = 0;
            }
            maxsum = Math.max(currsum, maxsum);

        }
        System.out.println("Maximum subarray sum is:" + maxsum);
    }
}
