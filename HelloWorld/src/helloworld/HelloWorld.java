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
//        System.out.print("Hello world 1");
//        System.out.print("\n");
//        System.out.println("Hello world 2");
//        System.out.printf("Minh kiet co %d nguoi theo doi", 10000000);
//        System.out.println();
//
//        int age = 22;
//        String name = "Lai Minh Kiet";
//        System.out.println("My age is: " + age + ", name is: " + name);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name is: ");
        String yourName = scanner.nextLine();
        System.out.println("Your age is: ");
        int yourAge = scanner.nextInt();
        System.out.println("My name is: " + yourName + " and age = " + yourAge);
        scanner.close();
    }

}
