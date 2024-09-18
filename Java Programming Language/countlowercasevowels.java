import java.util.Scanner;

public class countlowercasevowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = lower_casevowels(str);
        System.out.println(count);
    }

    public static int lower_casevowels(String str1) {
        int n = str1.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            char ch = str1.charAt(i);
            if (Character.isLowerCase(ch)) {
                count++;
            }

        }
        return count;
    }

}
