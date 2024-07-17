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
public class Bai_01 {

    public static int isPrime(int n) {
        if (n < 2) {
            return 0;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen duong: ");
        int number = scanner.nextInt();
        if (isPrime(number) == 1) {
            System.out.println(number + " la so nguyen to");
        } else {
            System.out.println(number + " khong la so nguyen to");
        }
    }
}
