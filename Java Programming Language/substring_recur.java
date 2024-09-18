public class substring_recur {
    public static void main(String[] args) {
        String str = "srishti";
        int n = str.length();
        System.out.print(countsubstrs(str, 0, n - 1, n));
    }

    public static int countsubstrs(String str, int i, int j, int n) {
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }
        int res = countsubstrs(str, i + 1, j, n - 1) + countsubstrs(str, i, j - 1, n - 1)
                - countsubstrs(str, i + 1, j - 1, n - 2);
        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;

    }

}
