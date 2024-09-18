import java.util.*;

public class inpuitfrom_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int key = sc.nextInt();
        int num[] = new int[5];
        System.out.println("Enter the elements in an array one by one");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println("Compare");
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                System.out.println(i);
            }
        }

    }
}
