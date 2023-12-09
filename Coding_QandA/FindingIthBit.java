package Coding_QandA;

import java.util.Scanner;

//find the Ith Bit of a number whether it is 0/1

public class FindingIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of N:");
        int n = sc.nextInt();
        System.out.println("enter the Ith value:");
        int i = sc.nextInt();
        int mask = 1 << i;
        System.out.println("the Ith bit is " + ((n & mask) != 0 ? 1 : 0));
        sc.close();
    }
}