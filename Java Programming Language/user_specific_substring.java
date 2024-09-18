import java.util.*;

public class user_specific_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ,si and ei");
        String str = sc.nextLine();
        int si = sc.nextInt();
        int ei = sc.nextInt();
        Substrings(str, si, ei);

    }

    public static void Substrings(String str, int si, int ei) {
        // String substr = "";
        // for (int i = si; i < ei; i++) {
        // // i<ei because we don't want to include the last ei character rather stop
        // // earlier as this is only the rule
        // substr = substr + str.charAt(i);
        System.out.println(str.substring(si, ei));

    }

}
