package com.tops_Assigment;
import java.util.Scanner;
public class ArraySum {
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);

     System.out.print("Enter the number of elements in the array: ");
     int n = scanner.nextInt();

     int[] arr = new int[n];
    
     for (int i = 0; i < n; i++) {
    	 System.out.println("Enter the elements of the array:");
         arr[i] = scanner.nextInt();
     }
	int sum=0;
	
	for (int i = 0; i < arr.length; i++) {
		sum += arr[i];
	}
	System.out.println("The sum of array is..."+sum);
    scanner.close();
}
}
