package com.tops_Assigment;
import java.util.Scanner;
public class ArrayAverage {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of elements in the array: ");
    int n = scanner.nextInt();

    int[] arr = new int[n];
   
    for (int i = 0; i < n; i++) {
        System.out.println("Enter the elements of the array:");
        arr[i] = scanner.nextInt();
    }
    double average = 0;
    
	for (int i = 0; i < arr.length; i++) {
		average += arr[i];
	}
	
	average /=arr.length;
	
	System.out.println("The sum of array is..."+average);
    scanner.close();
}
}
