public class count {
    public static void main(String args[]) {
        int count = 0;
        int n = 23;
        // while (n > 0) {
        // n = n / 10; // removing the last digit
        // count++;
        // // System.out.println(count);
        // }
        // System.out.println(count);
        // other optimal solution
        count = (int) (Math.log10(n) + 1);
        System.out.println(count);
    }
}
