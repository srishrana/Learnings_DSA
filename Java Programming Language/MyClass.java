public class MyClass {
    private int data;
    private int[] dataArray;

    // Default constructor
    public MyClass(int data, int[] dataArray) {
        this.data = data;
        this.dataArray = dataArray;
    }

    // Copy constructor
    public MyClass(MyClass other) {
        this.data = other.data;
        this.dataArray = new int[other.dataArray.length];
        for (int i = 0; i < other.dataArray.length; i++) {
            this.dataArray[i] = other.dataArray[i];
        }
    }

    // Getters and Setters
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int[] getDataArray() {
        return dataArray;
    }

    public void setDataArray(int[] dataArray) {
        this.dataArray = dataArray;
    }

    // Method to display object data
    public void display() {
        System.out.println("Data: " + data);
        System.out.print("DataArray: ");
        for (int i : dataArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        MyClass original = new MyClass(10, array);
        MyClass copy = new MyClass(original);

        // Display both objects
        original.display();
        copy.display();

        // Modify the original object's array
        array[0] = 100;

        // Display both objects again to show deep copy effect
        original.display();
        copy.display();
    }
}
