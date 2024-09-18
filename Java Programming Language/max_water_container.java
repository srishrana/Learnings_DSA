public class max_water_container {
    public static void main(String[] args) {
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        max_area(height);
    }

    public static void max_area(int height[]) {
        int max = Integer.MIN_VALUE;
        int area = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = height.length - 1; j >= 0; j--) {
                int width = j - i;
                int height1 = Math.min(height[i], height[j]);

                area = width * height1;

                if (max < area) {
                    max = area;
                }
            }
        }
        System.out.println(max);
    }
}
