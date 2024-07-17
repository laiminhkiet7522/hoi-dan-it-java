/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_03;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author kietm
 */
public class Bai_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap gia tri thu " + i + " : ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mang vua nhap co cac phan tu la:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        Arrays.sort(arr);
        System.out.println("Mang sau khi sap xep tang dan:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Phan tu lon nhat trong mang la: "+max);
        System.out.println("Phan tu nho nhat trong mang la: "+min);
    }
}
