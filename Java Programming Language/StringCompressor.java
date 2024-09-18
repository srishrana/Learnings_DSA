public class StringCompressor {
    public static String compressString(String input) {
        if (input == null || input.length() == 0) {
            return input;
        }

        StringBuilder compressed = new StringBuilder();
        int i = 0;
        int n = input.length();

        while (i < n) {
            char currentChar = input.charAt(i);
            int count = 0;

            // Count occurrences of the current character
            while (i < n && input.charAt(i) == currentChar) {
                i++;
                count++;
            }

            // Append the character and its count to the StringBuilder
            compressed.append(currentChar).append(count);
        }

        return compressed.toString();
    }

    public static void main(String[] args) {
        String input = "aaabbbbbccdd";
        System.out.println(input);
        String result = compressString(input);
        System.out.println(result); // Outputs: a3b5c2d2
    }
}
