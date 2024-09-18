public class palindromepattern {
    public static void main(String[] args) {
        int n = 5;
        palindrome(5);
    }

    public static void palindrome(int n) {
        for (int i = 1; i <= 5; i++) {
            // for spaces
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

}
