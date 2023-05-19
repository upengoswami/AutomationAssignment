package com.tops_Assigment;
import java.util.Scanner;
public class StringConcatenate {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first string: ");
    String str1 = scanner.nextLine();

    System.out.print("Enter the second string: ");
    String str2 = scanner.nextLine();

	
	 String result = str1.concat(" ").concat(str2); // Add space character between str1 and str2
	 
	 System.out.println("Concatenated String: " +result);
     scanner.close();
}
}
