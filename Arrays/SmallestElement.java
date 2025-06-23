import java.util.Arrays;

import java.util.Scanner;

public class SmallestElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        // Input the elements of the array
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        sc.close(); // Close the scanner to prevent resource leak

        // Find the smallest element
        int smallest = findSmallestElement(array);
        System.out.println("The smallest element in the array is: " + smallest);
    }

    // Function to find the smallest element in an array
    public static int findSmallestElement(int[] array) {
        int min = array[0]; // Assume first element is the smallest
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i]; // Update min if current element is smaller
            }
        }
        return min;
    }
}
