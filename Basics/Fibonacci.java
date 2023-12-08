package Basics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of N:");
        int n = sc.nextInt();
        int res = RecursiveFib(n);
        System.out.println("the Fibonacci value calculated by recursive code is " + res);
        int itr = IterativeFib(n);
        System.out.println("the Fibonacci value calculated by recursive code is " + itr);
        sc.close();

    }

    static int RecursiveFib(int n) {
        if (n <= 1) {
            return n;
        }
        return RecursiveFib(n - 1) + RecursiveFib(n - 2);
    }

    static int IterativeFib(int n) {
        int first = 0;
        int second = 1;
        int next = 0;
        if (n == 0) {
            return first;
        } else if (n == 1) {
            return second;
        }
        for (int i = 2; i <= n; i++) {
            next = first + second;
            first = second;
            second = next;
        }
        return next;
    }

}
