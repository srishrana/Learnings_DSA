public class anagram {
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        boolean result = check(str1, str2);
        System.out.println(result);
    }

    public static boolean check(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        while (n1 > 0) {
            if (n1 == n2) {

                for (int i = 0; i < n1; i++) {
                    for (int j = 0; j < n2; j++) {
                        if (str1.charAt(i) == str2.charAt(j))
                            break;
                    }
                }

            } else {
                System.out.println("Strings are not anagrams");
            }
        }
        return true;

    }
}
