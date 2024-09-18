import java.util.Scanner;

import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;

public class findout_ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("declaring the arrys");
        int num[] = new int[3];
        System.out.println("enter th elemnt to search ofr:");
        int x = sc.nextInt();
        System.out.println("ERnte rthe lemnts of the array");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("finding the element in an arry");
        for (int i = 0; i < num.length; i++) {
            if (num[i] == x) {
                System.out.println("Elemnt found at index:" + i);
            }

        }
        System.out.println("elemnt no found at index");
    }
}
