package com.tops_Assigment;

import java.util.Scanner;
public class StringCompare {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first string: ");
    String str1 = scanner.nextLine();

    System.out.print("Enter the second string: ");
    String str2 = scanner.nextLine();

    if (str1.equals(str2)) {
        System.out.println("Strings are equal.");
    } else {
        System.out.println("Strings are not equal.");
    }
    scanner.close();
}
}
