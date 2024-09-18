public class print_englis_number {
    public static void main(String[] args) {
        int number = 1234;
        String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        printNumberInEnglish(number, digits);
        System.out.println();
    }

    // Corrected method signature to include parameter types and access to the
    // digits array
    public static void printNumberInEnglish(int num, String[] digits) {
        if (num == 0) {
            return;
        }
        // Recursively call the method for the next digit
        // printNumberInEnglish(num / 10, digits);
        // Print the current last digit
        System.out.print(digits[num % 10] + " ");
        printNumberInEnglish(num / 10, digits);
    }
}
