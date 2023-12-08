package Basics;

import java.util.HashMap;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the words to check whether they are anagrams or not:");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        Boolean flag = false;
        HashMap<Character, Integer> map = new HashMap<>();

        // Populate the map for the first string
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Check the second string against the map
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (!map.containsKey(c)) {
                flag = true;
                break;
            } else {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) {
                    map.remove(c);
                }
            }
        }

        // Check if the map is empty to determine if they are anagrams
        if (!flag && map.isEmpty()) {
            System.out.println("They are anagrams.");
        } else {
            System.out.println("They are not anagrams.");
        }

        sc.close();
    }
}