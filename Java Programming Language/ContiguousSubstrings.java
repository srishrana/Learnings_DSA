public class ContiguousSubstrings {
    public static void main(String[] args) {
        String s1 = "srishti";
        // String s2 = "aba";

        int result1 = countContiguousSubstrings(s1);
        // int result2 = countContiguousSubstrings(s2);

        System.out.println("Sample Output 1: " + result1);
        // System.out.println("Sample Output 2: " + result2);
    }

    public static int countContiguousSubstrings(String s) {
        int count = 0;
        int n = s.length();

        // Iterate through all possible substrings
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Check if the first and last characters are the same
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
        }

        return count;
    }
}
