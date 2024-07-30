/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_08;

/**
 *
 * @author kietm
 */
public class Student extends Person {

    private int mark;
    private String grade;

    public Student(int mark, String grade) {
        this.mark = mark;
        this.grade = grade;
    }

    public Student(int mark, String id, String name, int age) {
        super(id, name, age);
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade() {
        if (this.mark >= 8) {
            this.grade = "A";
        } else if (this.mark >= 7) {
            this.grade = "B";
        } else if (this.mark >= 6) {
            this.grade = "C";
        } else if (this.mark >= 5) {
            this.grade = "D";
        } else {
            this.grade = "Tạch cmnr";
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("mark=").append(mark);
        sb.append(", grade=").append(grade);
        sb.append('}');
        return sb.toString();
    }
    
}
