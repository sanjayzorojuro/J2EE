package main;

import java.util.Scanner;

enum Gender {
    MALE, FEMALE, OTHER
}

enum EmployeeType {
    FULLTIME(10), PARTTIME(20), CONTRACT(30);
    int value;

    EmployeeType(int val) {
        value = val;
    }
}

interface EmployeeSalary {

    void CalculateSalary();
}

class Employeee implements EmployeeSalary {

    int empId;
    String name;
    float gross, Net, hra;
    Gender gender;
    EmployeeType type;
    static Scanner sc = new Scanner(System.in);

    void getData() {
        try {
            System.out.println("Enter empid, name, gross: ");
            empId = sc.nextInt();
            name = sc.next();
            gross = sc.nextFloat();

            System.out.println("Enter gender: ");
            String g = sc.next(); //it is for gender
            gender = Gender.valueOf(g.toUpperCase()); //if enter gender is not gender object //then it will throws an exception. so enclose it inside try catch
            System.out.println("Enter employee type: ");
            type = EmployeeType.valueOf(sc.next().toUpperCase());
        } catch (Exception e) {
            System.out.println("Invalid gender or type");
        }
    }

    @Override
    public void CalculateSalary() {
        hra = gross * 0.1f;
        Net = gross + hra;
    }

    void display() {
        System.out.printf("----------------------------------------\n");
        System.out.printf("EmpID:%d\nName: %s\nGender: %s\nEmpType value:%s",empId, name, gender, type);
        System.out.printf("----------------------------------------\n");

    }
}

public class Employee {

    public static void main(String[] args) {
        Employeee emp = new Employeee();
        emp.getData();
        emp.CalculateSalary();
        emp.display();

    }
}
