/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package a4.a4;

import java.util.Scanner;

/**
 *
 * @author sanja
 */
public class A4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:\n");  
        String[] words = sc.nextLine().split("\\s+");
        String toggle = "";
        for (String word : words) {
            if (word.length() % 2 == 0) {
                String temp = "";
                for (int i = 0; i < word.length(); i += 2) {
                    temp = temp + word.charAt(i + 1) + word.charAt(i);
                }
                System.out.print(temp + " ");
            }
            for (char c : word.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    toggle += Character.toLowerCase(c);
                } else {
                    toggle += Character.toUpperCase(c);
                }
            }
            toggle += " ";
        }
        System.out.println("\nToggled sentence: \n" + toggle);
    }

}
