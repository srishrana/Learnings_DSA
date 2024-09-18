public class countset {
    public static void main(String[] args) {
        int number = 23;
        String x = Integer.toBinaryString(number);
        System.out.println(x);
        int len = x.length();
        int count = 0;
        char chr[] = x.toCharArray();
        for (int i = 0; i < len; i++) {
            if (chr[i] == '1') {
                count++;
            }
        }
        System.out.println(count);
    }

}
