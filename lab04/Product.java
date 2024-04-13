package lab04;
import java.util.Scanner;

public class Product {
    private String name ;
    private double price ;
    private double tax ;

    public double getPrice(){
        return price;
    }
    public double getTax(){
        return tax;
    }
    public void setTax(double tax){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public Product nhapThongTin(String name , double price, double tax){
      Product sp1 = new Product(name, price, tax);
      return sp1;
        

    }
    public void xuatThongTin(Product sp1){
        System.out.println("Ten san pham: " + sp1.getName());
        System.out.println("Gia san pham: " + sp1.getPrice());  
        System.out.println("Thue san pham: " + sp1.getTax());

    }
    public double getTaxPrice(double price, double tax){
        return price * tax;
    }
    Product(){
        this.name = "tivi ";
        this.price = 1000;
        this.tax = 0.1;
    }
    Product(String name, double price, double tax){
        this.name = name;
        this.price = price;
        this.tax =tax;
    }
    public String getName(){
        return name;

    }
    public void setName(String name1){
        this.name = name1;
    }
    
}
