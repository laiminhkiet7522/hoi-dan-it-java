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
public class Bai_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao canh cua mot khoi lap phuong: ");
        double canh = scanner.nextDouble();
        double theTich = Math.pow(canh, 3);
        System.out.println("The tich khoi lap phuong = " + theTich);
    }
}
//Bài 3: Viết chương trình nhập vào bàn phím cạnh của một khối lập phương.
//Tính và xuất ra thể tích của hình lập phương.
