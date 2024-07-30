/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_07;

/**
 *
 * @author kietm
 */
public class Lab_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SinhVien it1 = new SinhVienIT(10, 9);
        System.out.println("Sinh Vien IT score = " + it1.getScore());
        SinhVien ck1 = new SinhVienCoKhi(10, 8);
        System.out.println("Sinh Vien Co Khi score = " + ck1.getScore());
    }
}
