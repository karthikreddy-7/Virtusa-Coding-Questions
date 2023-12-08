package Basics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the word to check for palindrome: ");
        String s = sc.nextLine();
        int start = 0;
        int end = s.length() - 1;
        Boolean flag = false;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                flag = true;
                break;
            } else {
                start++;
                end--;
            }
        }
        if (!flag) {
            System.out.println("the word " + s + " is a palindrome.");
        } else {
            System.out.println("it is not a palindrome");
        }
        sc.close();
    }
}
