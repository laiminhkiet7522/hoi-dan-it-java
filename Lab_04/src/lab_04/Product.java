/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_04;

/**
 *
 * @author kietm
 */
public class Product {

    private String name;
    private double price;
    private double tax;

    public Product() {
    }

    public Product(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    public Product nhapThongTin(String name, double price, double tax) {
        Product pr = new Product(name, price, tax);
        return pr;
    }

    public void xuatThongTin(Product pr) {
        System.out.println("Name = " + pr.getName() + ", price = " + pr.getPrice() + ", tax = " + pr.getTax());
    }

    public double getTaxPrice(double price, double tax) {
        return price * tax;
    }
}
