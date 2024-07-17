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
public class Bai_04 {
    
    public static void bai_01()
    {
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
    public static void bai_02()
    {
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
    public static void bai_03()
    {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ----------------------------------------- ++");
        System.out.println("| 1. Giải phương trình bậc nhất |");
        System.out.println("| 2. Giải phương trình bậc hai |");
        System.out.println("| 3. Tính số tiền điện |");
        System.out.println("| 4. Kết thúc |");
        System.out.println("++ ------------------ ++");
        System.out.println("Nhap lua chon cua ban: ");
        int luaChon = scanner.nextInt();
        switch(luaChon)
        {
            case 1:
                bai_01();
                break;
            case 2:
                bai_02();
                break;
            case 3:
                bai_03();
                break;
            default:
                System.out.println(">> Ban da thoat chuong trinh <<");
                System.exit(0);
        }
    }
}
