/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_05;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author kietm
 */
public class Lab_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> arrNumber = new ArrayList();
        while (true) {
            System.out.println("Nhap vao 1 so thuc bat ky: ");
            double input = scanner.nextDouble();
            arrNumber.add(input);
            scanner.nextLine();
            System.out.println("Continue? 'Y' or 'N'");
            String option = scanner.nextLine();
            if (option.equals("N") || option.equals("n")) {
                break;
            }
        }
        double tong = 0.0;
        for (int i = 0; i < arrNumber.size(); i++) {
            tong += arrNumber.get(i);
        }
        System.out.println("Tong = " + tong);
    }
}
