package com.tops_Assigment;
import java.util.Scanner;
public class PrimeSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of prime numbers to consider: ");
        int targetCount = scanner.nextInt();
        int count = 0;
        long sum = 0;

        for (int i = 2; count < targetCount; i++) {
            boolean isPrime = true;

            // check if i is prime
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
                sum += i;
            }
        }

        System.out.println("The sum of the first 100 prime numbers is: " + sum);
        scanner.close();
	}
}
