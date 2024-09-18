/*package whatever //do not write package name here */

import java.util.Stack;

public class Rev_array_stack {
    public static void reverseArrayUsingStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        for (int element : arr) {
            stack.push(element);
        }

        // Pop elements from the stack to reverse the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        for (int i : arr) {
            System.out.print(i + " ");
        }

        reverseArrayUsingStack(arr);

        System.out.print("Reversed Array: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}