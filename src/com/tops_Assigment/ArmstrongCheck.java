package com.tops_Assigment;
import java.util.Scanner;

public class ArmstrongCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int originalNum = num;
        int sum = 0;

        for (int temp = num; temp > 0; temp /= 10) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
        scanner.close();
}
}