import javax.sound.sampled.SourceDataLine;

public class swap_2_num_XOR {
    public static void main(String[] args) {

        int a = 5;
        int b = 7;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " " + b);
    }
}
