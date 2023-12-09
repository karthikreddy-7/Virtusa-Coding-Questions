package Coding_QandA;

import java.util.Scanner;

public class ConvertingAtoB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of A:");
        int a = sc.nextInt();
        System.out.println("enter the value of B:");
        int b = sc.nextInt();
        int diff = a ^ b;
        int count = 0;
        while (diff > 0) {
            if ((diff & 1) == 1) {
                count++;
            }
            diff = diff >> 1;
        }
        System.out.println("the number of bits to be changed is : " + count);
        sc.close();
    }

}
