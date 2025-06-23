package ArraysProgram;

import java.util.Scanner;

public class NearPrime {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();        
        sc.close(); // Close the scanner to prevent resource leak

        int nearestPrime = nearestPrime(num);
        System.out.println("Nearest Prime Number: " + nearestPrime);
    }

    // Function to find the nearest prime number
    public static int nearestPrime(int num) {
        if (isPrime(num)) {
            return num;
        }

        int lowerPrime = num - 1;
        int upperPrime = num + 1;

        while (true) {
            if (isPrime(lowerPrime)) {
                return lowerPrime;
            }
            if (isPrime(upperPrime)) {
                return upperPrime;
            }
            lowerPrime--;
            upperPrime++;
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
