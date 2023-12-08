package Basics;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number to check whether it is a palindrome or not: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("it is a prime number.");
        } else {
            System.out.println("it is not a prime number.");
        }
        sc.close();
    }

}
