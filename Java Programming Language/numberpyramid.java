public class numberpyramid {
    public static void num_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");// for spaces
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");

            }
            System.out.println();
        }
        System.out.println();

    }

    public static void main(String[] args) {
        num_pyramid(5);
    }
}
