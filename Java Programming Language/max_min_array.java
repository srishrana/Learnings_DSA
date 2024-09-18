import java.util.Scanner;

public class max_min_array {
    public static void main(String[] args) {
        int marks[] = { 1, 3, 5, 2, 3, 8, 0, 10, 11, 3, 5, 7 };
        smallest_largest(marks);

    }

    public static void smallest_largest(int marks[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        int k = 0;
        for (i = 0; i < marks.length; i++) {
            // maximum
            if (marks[i] > max) {
                max = marks[i];
                j = i;
            }
            // minimum
            if (marks[i] < min) {
                min = marks[i];
                k = i;
            }
        }
        System.out.println("Mximum:" + max + "at index=" + j);
        System.out.println("Minimum:" + min + "at index=" + k);

    }
}
