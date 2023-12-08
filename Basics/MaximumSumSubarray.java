package Basics;

import java.util.Scanner;

public class MaximumSumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(i + " element : ");
            arr[i] = sc.nextInt();
        }
        // finding maximum sum in subarray: Brute Force
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int cursum = 0;
            for (int j = i; j < n; j++) {
                cursum += arr[j];
                if (cursum > maximum) {
                    maximum = cursum;
                }
            }
        }
        System.out.println(maximum);
        int maxsum = 0;
        int cursum = 0;
        for (int i = 0; i < n; i++) {
            cursum += arr[i];
            if (cursum > maxsum) {
                maxsum = cursum;
            }
            if (cursum < 0) {
                cursum = 0;
            }
        }
        System.out.println(maxsum);
        sc.close();
    }
}
