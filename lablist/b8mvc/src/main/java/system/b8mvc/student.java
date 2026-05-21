/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system.b8mvc;

/**
 *
 * @author sanja
 */
public class student {
    int rno,total,m1,m2,m3;
    String name,grade;
    float percentage;

    public student(int rno, int total, int m1, int m2, int m3, String name, String grade, float percentage) {
        this.rno = rno;
        this.total = total;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.name = name;
        this.grade = grade;
        this.percentage = percentage;
    }

    student(String name, int id, int m1, int m2, int m3) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public int getTotal() {
        cal();
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getM1() {
        return m1;
    }

    public void setM1(int m1) {
        this.m1 = m1;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public int getM3() {
        return m3;
    }

    public void setM3(int m3) {
        this.m3 = m3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }
    public void cal(){
        total = m1+m2+m3;
        percentage = (float) ((float) total / 3.0);
        
        if(percentage >90)
            grade = "A";
        else if(percentage >80)
            grade = "B";
        else if (percentage >70)
            grade = "C";
        else if(percentage > 60)
            grade = "D";
        else
            grade = "E";
    }
    
    
}
