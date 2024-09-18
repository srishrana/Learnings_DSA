public class count_len_recur {
    public static void main(String[] args) {
        String str = "Srishti";
        int idx = 0;
        int len = countLengthString(str, idx);
        System.out.println(len);
    }

    public static int countLengthString(String str, int i) {
        // Base case
        if (i == str.length()) {
            return 0; // Return 0 when the end of the string is reached
        }

        // Recursive call to count the length of the substring starting from index i + 1
        return 1 + countLengthString(str, i + 1);
    }
}
