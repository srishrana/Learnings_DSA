public class poss_subarrays {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        // int maxsum = poss_subarrays1(arr);
        int minsum = poss_subarrays1(arr);
        // System.out.println(maxsum);
        System.out.println(minsum);
        // total possible pairs

    }

    public static int poss_subarrays1(int arr[]) {
        // int count = 0;
        int sum = 0;
        // int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                count++;
                sum = arr[i] + arr[j];
                System.out.println("sum" + "->" + sum);

            }

            // if (maxsum < sum) {
            // maxsum = sum;
            // }
            if (minsum > sum) {
                minsum = sum;
            }
            // int sum = arr[i] + arr[j];
            // System.out.print("sum" + "->" + sum);
            System.out.println();

        }
        return minsum;
    }
}
