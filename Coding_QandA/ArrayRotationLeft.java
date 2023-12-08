package Coding_QandA;

import java.util.Scanner;

public class ArrayRotationLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(i + " element : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the value of K: ");
        int k = sc.nextInt();
        k = k % n;
        int[] res = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int ind = (i - k);
            if (ind < 0) {
                ind += n;
            }

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
