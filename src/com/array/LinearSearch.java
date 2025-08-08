package com.array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {25, 11, 7, 75, 56};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element to search: ");
        int search = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}
