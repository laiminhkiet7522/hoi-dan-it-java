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
public class Bai_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap vao so b: ");
        int b = scanner.nextInt();
        System.out.println("Giai phuong trinh bac nhat " + a + "x+" + b);
        if (a == 0 && b == 0) {
            System.out.println("Phuong trinh vo so nghiem");
        } else if (a == 0 && b != 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else {
            float res = (float)-b / a;
            System.out.println("Nghiem cua phuong trinh x = " + res);
        }
    }
}
