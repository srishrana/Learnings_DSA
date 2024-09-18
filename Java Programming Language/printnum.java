import java.net.SocketImpl;
import java.util.Arrays;
import java.util.Scanner;

import javax.naming.ldap.SortResponseControl;
import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;

public class printnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of subjetc smarks");
        int n = sc.nextInt();
        int num[] = new int[n];
        System.out.println("Enter the marks");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();

        }
        System.out.println("Printing the elemnts");
        // for(int i=0;i<num.length;i++){
        // num[i]=sc.nextInt();
        // System.out.println(num[i]);

        // }
        System.out.println(Arrays.toString(num));

    }
}
