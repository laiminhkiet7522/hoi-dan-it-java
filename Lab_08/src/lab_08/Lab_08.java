/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_08;

/**
 *
 * @author kietm
 */
public class Lab_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new Student(9, "123", "Lai Minh Kiet", 23);
        st1.setGrade();
        System.out.println(st1);

        Person p1 = new Person("333", "Kiet", 22);
        System.out.println(p1);
    }

}
