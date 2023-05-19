package com.tops_Assigment;

import java.util.Scanner;

public class PrimeCheck {
	  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);

	  System.out.print("Enter a number: ");
	  int num = scanner.nextInt();
	  scanner.close();

	  boolean isPrime = true;
	        
	  for (int i = 2; i < num; i++) {
		  if (num % i == 0) {
			  isPrime = false;
			  break;
		  }
	  }

	  System.out.println(num + " is " + (isPrime ? "" : "not ") + "a prime number.");
}
}
