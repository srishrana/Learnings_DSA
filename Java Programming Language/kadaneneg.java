public class kadaneneg {
    public static long maxSubarraySum(int[] arr) {

        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;

        for (int i : arr) {
            currsum += i;

            if (maxsum < currsum) {
                maxsum = currsum;
            }

            if (currsum < 0) {
                currsum = 0;
            }

        }
        return maxsum;
    }

    public static void main(String[] args) {
        int arr[] = { -1, -2, -3, -4 };
        long sum = maxSubarraySum(arr);
        System.out.println(sum);
    }
}
