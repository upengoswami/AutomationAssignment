package com.tops_Assigment;
import java.util.Scanner;

public class MaxMinArrayValue {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the number of elements in the array: ");
    int n = scanner.nextInt();
    
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
        arr[i] = scanner.nextInt();
    }
    
    scanner.close();
    
     int max = arr[0];
     int min = arr[0];
     
     for (int i = 1; i < arr.length; i++) {
         if (arr[i] > max) {
             max = arr[i];
         }
         if (arr[i] < min) {
             min = arr[i];
         }
     }
     
     System.out.println("Maximum value in the array: " + max);
     System.out.println("Minimum value in the array: " + min);
}
}
