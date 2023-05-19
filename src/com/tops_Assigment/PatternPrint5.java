package com.tops_Assigment;

import java.util.Scanner;

public class PatternPrint5 {
	public static void main(String[] args) {
//        int n = 5;
//
//        // Upper part of pattern
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//
//        // Lower part of pattern
//        for (int i = n - 1; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//        System.out.println(" * ");
		Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter the number of rows: ");
	    int rows = scanner.nextInt();
	    scanner.close();
	    
        // Upper part of pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2*i-1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower part of pattern
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2*i-1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
		
		
	}
}
  