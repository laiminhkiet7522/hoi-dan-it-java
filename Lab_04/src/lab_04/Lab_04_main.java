/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_04;

/**
 *
 * @author kietm
 */
public class Lab_04_main {
    public static void main(String[] args) {
        Product test = new Product();
        Product pr1 = test.nhapThongTin("computer", 200, 0.1);
        test.xuatThongTin(pr1);
        System.out.println("Tax = " + test.getTaxPrice(pr1.getPrice(), pr1.getTax()));
    }
}
