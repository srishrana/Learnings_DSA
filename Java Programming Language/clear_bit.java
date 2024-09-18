import java.util.*;

public class clear_bit {
    public static void main(String[] args) {
        // int num = 7;
        // int pos = 1;
        // int mask = ~(1 << pos);
        // int res = num & mask;
        // System.out.println(res);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  a number");
        int num = sc.nextInt();
        System.out.println("enter the pos");
        int pos = sc.nextInt();
        int res = clear_bit(num, pos);
        System.out.println(res);
        // int mask = 1 << pos;
        // int fmask = ~mask;
        // int res1 = num & fmask;
        // System.out.println(res);
    }

    public static int clear_bit(int number, int posi) {
        int mask = 1 << posi;
        int fmask = ~mask;
        int res = number & fmask;
        return res;
    }
}
