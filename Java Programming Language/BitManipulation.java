import java.util.*;

//just want to check whether my number is even or odd
public class BitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        // int result = getithbit(10, 2);
        // System.out.println(result);
        // int result = setithbit(3, 2);
        // System.out.println(result);
        int result = clearithbit(7, 2);
        System.out.println(result);

        // // just want to check whether my number is even or odd //had just to check
        // whether my LSB is 0 or 1
        // so AND operation with 1
        // int bitmask = 1;
        // if ((n & bitmask) == 0) {
        // System.out.println("Number is even");
        // } else {
        // System.out.println("Number is odd");
        // }
    }

    // get ith bit
    // Number AND bit mask(1<<i) where i -ith bit in number which i want to know
    // whether 0 or 1

    // public static int getithbit(int n, int i) {
a
    // int bitmask = 1 << i;
    // if ((n & bitmask) == 0) {
    // return 0;
    // } else {
    // return 1;
    // }
    // }

    // set ith bit
    // Number OR Bitmask(1<<i) where i -ith bit in number which i want to set
    // logic function
    // public static int setithbit(int n, int i) {
    // int bitmask = 1 << i;
    // return n | bitmask;
    // }

    // logic for clear bit i-e make the bit as 0
    // logic function
    public static int clearithbit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;

    }

}
