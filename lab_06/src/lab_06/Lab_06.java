/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_06;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kietm
 */
public class Lab_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap vao username: ");
//        String userName = scanner.nextLine();
//        System.out.println("Nhap vao password: ");
//        String passWord = scanner.nextLine();
//        if (userName.equals("hoidanit") && passWord.length() > 6) {
//            System.out.println("Hop le!");
//        } else {
//            System.out.println("Khong hop le!");
//        }

        Student st1 = new Student("Nguyen Van A", "1");
        Student st2 = new Student("Nguyen Van B", "1");
        Student st3 = new Student("Nguyen Van C", "1");
        Student st4 = new Student("Tran Van D", "1");
        Student st5 = new Student("Phan Van E", "1");

        ArrayList<Student> arrStudent = new ArrayList<>();
        arrStudent.add(st1);
        arrStudent.add(st2);
        arrStudent.add(st3);
        arrStudent.add(st4);
        arrStudent.add(st5);
        
        for(int i=0; i<arrStudent.size(); i++)
        {
            if(arrStudent.get(i).getName().startsWith("Nguyen"))
            {
                System.out.println("Start with 'Nguyen': "+arrStudent.get(i));
            }
        }
    }
}
