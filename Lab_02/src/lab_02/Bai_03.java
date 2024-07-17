/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_02;

import java.util.Scanner;

/**
 *
 * @author kietm
 */
public class Bai_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so dien: ");
        int soDien = scanner.nextInt();
        double thanhTien = 0.0D;
        if (soDien <= 100) {
            thanhTien = soDien * 1000;
        } else {
            thanhTien = 100 * 1000 + (soDien - 100) * 1500;
        }
        System.out.println("Tong thanh tien = " + thanhTien);
    }
}
