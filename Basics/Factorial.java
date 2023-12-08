package Basics;

import java.util.Scanner;

//Write a program to calculate the factorial of a given number. 
//The factorial of a non-negative integer n is the product of all positive integers less than or equal to n.
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to calculate it's Factorial:");
        int n = sc.nextInt();
        int res = recursiveFact(n);
        System.out.println("The factorial of " + n + " calculated by recursive code is " + res);
        int itr = Iterative(n);
        System.out.println("The factorial of " + n + " calculated by Iterative code is " + itr);
        sc.close();

    }

    static int Iterative(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    static int recursiveFact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * (recursiveFact(n - 1));
    }

}
