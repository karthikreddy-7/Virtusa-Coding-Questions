package Coding_QandA;

import java.util.Scanner;

//Given a number N and another number K, find the last digit number formed when N is raised to the power K.
//Note: The values of N and K can be very large
public class LastDigitNumberFormed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        double n = sc.nextDouble();
        System.out.println("enter the value of K");
        double k = sc.nextDouble();
        double res = Math.pow(n, k);
        System.out.println("the last digit of the N power K is " + (int) (res % 10));
        sc.close();

    }

}
