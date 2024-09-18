public class MostsignificantSetBit {
    public static void main(String[] args) {
        int number = 10; // Example number

        if (number == 0) {
            System.out.println("shut up!"); // Return -1 if the number is 0, as there are no set bits
        }

        int msbPosition = 0;

        while (number > 0) {
            number >>= 1;
            msbPosition++;
        }

        System.out.println(msbPosition);
    }
}
