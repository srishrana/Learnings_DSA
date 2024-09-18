import java.util.*;

public class array_updation_passing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nonchangeable = 10;
        int marks[] = { 99, 100, 101 };
        update(marks, nonchangeable);
        print(marks);
    }

    public static void update(int marks[], int non) {
        int nonchangeable = 11;
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }

    public static void print(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

    }

}
