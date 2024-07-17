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
public class Bai_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap vao b: ");
        int b = scanner.nextInt();
        System.out.println("Nhap vao c: ");
        int c = scanner.nextInt();

        System.out.println("Giai phuong trinh bac hai");
        if (a == 0) {
            if (b == 0 && c == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else if (b == 0 && c != 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else {
                float res = (float) -c / b;
                System.out.println("Phuong trinh co 1 nghiem duy nhat x = " + res);
            }
        } else {
            float delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                float nghiemKep = (float) -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep");
                System.out.println("x=" + nghiemKep);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co hai nghiem phan biet");
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
            }
        }
    }
}
