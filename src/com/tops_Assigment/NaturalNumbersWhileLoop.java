package com.tops_Assigment;
import java.util.Scanner;
public class NaturalNumbersWhileLoop {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the maximum number of natural numbers: ");
    int maxNumber = scanner.nextInt();
    scanner.close();
    
    int i = 1;
    while (i <= maxNumber) {
        System.out.println(i);
        i++;
    }
}
}
