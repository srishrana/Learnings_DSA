public class XOR_1_TO_N {
    public static void main(String[] args) {
        int number = 7;
        int result = XOR1(number);
        System.out.println(result);

    }

    public static int XOR1(int num) {
        if (num % 4 == 0)
            return num;
        else if (num % 4 == 1)
            return 1;
        else if (num % 4 == 2)
            return num + 1;
        else
            return 0;

    }
}