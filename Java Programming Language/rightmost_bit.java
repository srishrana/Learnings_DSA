public class rightmost_bit {
    public static void main(String[] args) {
        int n = 4;
        if (n == 0) {
            System.out.println("no is 0");
        }
        int tpos = 0;
        while ((n & 1) == 0) {// cannot be written as while (n & 1 == 0)
            n = n >> 1;
            tpos++;
        }
        System.out.println(tpos);

    }
}
