package com.tops_Assigment;

import java.util.Scanner;

public class Patternprint4 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of rows: ");
    int rows = scanner.nextInt();
    scanner.close();
    
	for (int i =1; i <=rows; i++) {
		for (int j = i; j <=5; j++) {
			System.out.print(" ");
			
		}
		for (int j = 1; j <=i; j++) {
			System.out.print(" " +i);
		}
		System.out.println();
	}
}
}
 