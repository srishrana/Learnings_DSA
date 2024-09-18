public class calculator {
    public static void main(String[] args) {
        calc s1 = new calc();
        int sum = s1.sum(2, 3);
        int su1 = s1.sum(2, 3, 4);
        double s1a = s1.sum(2, 4);
        System.out.println(sum);
        System.out.println(su1);
        System.out.println(s1a);
    }
}

class calc {
    int key;

    int sum(int a, int b) {
        return (a + b);
    }

    int sum(int a, int b, int c) {
        return (a + b + c);
    }

    double sum(float a, float b) {
        return (a + b);
    }
}
