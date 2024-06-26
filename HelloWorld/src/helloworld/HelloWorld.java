/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworld;

import java.util.Scanner;


/**
 *
 * @author kietm
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int a=6;
//        int b=9;
//        int c = Math.max(a, b);
//        System.out.println("Max = "+c);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number: ");
        int firstNumber = scanner.nextInt();
        
        System.out.println("Second number: ");
        int secondNumber = scanner.nextInt();
        
        System.out.println("Min = "+Math.min(firstNumber, secondNumber));
    }

}
