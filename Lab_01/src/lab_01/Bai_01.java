/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_01;

import java.util.Scanner;

/**
 *
 * @author kietm
 */
public class Bai_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten cua ban: ");
        String name = scanner.nextLine();
        System.out.println("Nhap diem trung binh: ");
        double score = scanner.nextDouble();
        System.out.println(name+" co diem trung binh = "+score);
    }
    
}
//Bài 1:
//Viết chương trình cho phép nhập tên sinh viên, điểm trung bình từ bàn phím.
//In ra màn hình với định dạng:
//<tên_sinh_viên> có điểm = <điểm>
//Ví dụ: "Eric" có điểm = 9.6
//<tên sinh viên>: Eric
//<điểm> : 10