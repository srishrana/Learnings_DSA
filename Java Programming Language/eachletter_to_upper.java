import java.util.*;

/**
 * eachletter_to_upper
 */
public class eachletter_to_upper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        System.out.println(toupper(str));

    }

    public static String toupper(String str) {
        StringBuilder sb = new StringBuilder(" ");
        System.out.println(sb);
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(i);
            }
        }
        return (sb.toString());
        // System.out.println(str1);

    }

}