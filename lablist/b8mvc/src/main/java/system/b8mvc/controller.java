/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system.b8mvc;

import java.util.Scanner;

/**
 *
 * @author sanja
 */
public class controller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name:");
        String name = sc.next();
        System.out.println("Enter roll no , m1,m2,m3 ");
        int id = sc.nextInt();
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        student s = new student(name,id,m1,m2,m3);
        studentview v = new studentview(s);

    }
}
