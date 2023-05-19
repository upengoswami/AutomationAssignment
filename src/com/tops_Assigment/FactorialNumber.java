package com.tops_Assigment;

import java.util.Scanner;
public class FactorialNumber {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = scanner.nextInt();
    scanner.close();

	int fact = 1;
	for (int i = 1; i <=n; i++) {
		fact *=i;
		
	}
	System.out.println("Factorial of " + n + " is " + fact);
}
}
