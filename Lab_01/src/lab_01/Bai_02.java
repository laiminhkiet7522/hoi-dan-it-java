/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_01;

import java.util.Scanner;

/**
 *
 * @author kietm
 */
public class Bai_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai hinh chu nhat: ");
        double chieuDai = scanner.nextDouble();
        System.out.println("Nhap vao chieu rong hinh chu nhat: ");
        double chieuRong = scanner.nextDouble();
        double chuVi = (chieuDai + chieuRong) * 2;
        double dienTich = chieuDai * chieuRong;
        System.out.println("Chu vi hinh chu nhat la: " + chuVi);
        System.out.println("Dien tich hinh chu nhat la: " + dienTich);
    }
}
//Bài 2: Viết chương trình nhập từ bàn phím 2 cạnh của 1 hình chữ nhật.
//Tính toán và in ra console:
//- chu vi hình chữ nhật
//- diện tích hình chữ nhật
//- cạnh nhỏ nhất của hình chữ nhật
