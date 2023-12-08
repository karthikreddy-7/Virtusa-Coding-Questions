package Basics;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(i + " element : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the value of K to be shifted: ");
        int k = sc.nextInt();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int ind = (i + k) % n;
            res[ind] = arr[i];
        }
        System.out.println("the input array is :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("the output array is :");
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
        sc.close();
    }
}
