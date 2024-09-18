import java.util.Scanner;

public class set_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the position");
        int pos = sc.nextInt();
        int mask = 1 << pos;
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int res = num | mask;
        System.out.println(res);

    }

}
