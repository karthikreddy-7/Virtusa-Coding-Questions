package Basics;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of terms:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(i + " element : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the element to search:");
        int key = sc.nextInt();
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("the element has been found at index " + mid);
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (low > high) {
            System.out.println("The element is not present in the array.");
        }

        sc.close();

    }
}
