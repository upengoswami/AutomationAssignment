package com.tops_Assigment;
import java.util.Scanner;
public class ArrayIndex {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of elements in the array: ");
    int n = scanner.nextInt();

    int[] arr = new int[n];
   
    for (int i = 0; i < n; i++) {
    	System.out.println("Enter the elements of the array:");
        arr[i] = scanner.nextInt();
    }

    System.out.print("Enter the element to search: ");
    int searchElement = scanner.nextInt();

    int index = -1;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == searchElement) {
            index = i;
            break;
        }
    }

    if (index != -1) {
        System.out.println("The index of element " + searchElement + " is: " + index);
    } else {
        System.out.println("Element " + searchElement + " not found in array.");
    }
    scanner.close();
}
}
