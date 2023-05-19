package com.tops_Assigment;

import java.util.Scanner;

public class GreatestNumber {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	 System.out.print("Enter first number: ");
     int num1 = input.nextInt();

     System.out.print("Enter second number: ");
     int num2 = input.nextInt();

     System.out.print("Enter third number: ");
     int num3 = input.nextInt();

     int greatest = num1;

     if (num2 > greatest) {
         greatest = num2;
     }

     if (num3 > greatest) {
         greatest = num3;
     }

     System.out.println("The greatest number is: " + greatest);
     input.close();
}
}
