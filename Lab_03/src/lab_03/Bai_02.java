/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_03;

import java.util.Scanner;

/**
 *
 * @author kietm
 */
public class Bai_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen duong tu 1->10: ");
        int number = scanner.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(number + "*" + i + "=" + number * i);
        }
    }
}
