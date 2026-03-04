package Enumerator;

import java.util.Scanner;

enum Gender {
    MALE, FEMALE, OTHER
}

enum Gender1 {
    MALE("male"), FEMALE("female"), OTHER("other");
    String value;

    Gender1(String val) {
        value = val;
    }
}

interface Numerics {

    void calculate();
}

class Student implements Numerics {

    static Scanner sc = new Scanner(System.in);
    int rollnumber, m1, m2, total;
    String name;
    Gender1 gender;

    void getData() {
        System.out.println("Enter roll:");
        rollnumber = sc.nextInt();
        System.out.println("Enter name:");      
        name = sc.next();
        System.out.println("Enter Mark 1:");
        m1 = sc.nextInt();
        System.out.println("Enter Mark 2:");       
        m2 = sc.nextInt();
        System.out.println("Enter gender: ");
        String g = sc.next();
        gender = Gender1.valueOf(g);
    }

    @Override
    public void calculate() {
        total = m1 + m2;
    }

    void display() {
        System.out.printf("Student Rollnumber: %d \n M1: %d \n M2:%d \n Name: %s \n Gender:%s \n Total:%d \n", rollnumber, m1, m2, name, gender, total);

    }
}

public class Enumexample2 {

    public static void main(String[] args) {
        Student s = new Student();
        s.getData();
        s.calculate();
        s.display();
    }
}
