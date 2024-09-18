import javax.sound.sampled.SourceDataLine;

public class passarr_arg {
    public static void main(String[] args) {
        int marks[] = { 99, 100, 101 };
        int nonchangeable = 5;
        update(marks);
        System.out.println();

    }

    public static void update(int marks[], int nonchangeable);

    {
        int nonchangeable = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
        System.out.println();
    }
}
