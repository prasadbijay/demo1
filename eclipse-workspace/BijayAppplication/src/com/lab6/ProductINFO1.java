package com.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Product implements Comparable<Product> {
    private int productId;
    String productName;
    int productPrice;

    public Product(int productId, String productName, int productPrice) {
        super();
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public int compareTo(Product o) {
        if (this.productPrice != o.productPrice) {
            return Integer.compare(o.productPrice, this.productPrice);
        }
        return this.productName.compareTo(o.productName);
    }
//i used logic to compare price of product.
    @Override
    public String toString() {
        return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice + "]";
    }
}

public class ProductINFO1 {
    public static void main(String[] args) {
        List<Product> value = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(" Please enter Product id: ");
            int id = sc.nextInt();
            System.out.println(" Please enter Product Name: ");
            String name = sc.next();
            System.out.println(" Please enter Product Price: ");
            int price = sc.nextInt();
            sc.nextLine();

            Product pro = new Product(id, name, price);
            value.add(pro);

            System.out.println("Do you want to Add More Product? (yes/no)");
            String response = sc.next();
            if (!response.equalsIgnoreCase("yes")) {  
                break;
            }
        }

        // i'm Sort the products after all have been added
        Collections.sort(value);

        // and here i'm Display the sorted products
        for (Product display : value) {
            System.out.println(display);
        }

        sc.close();
    }
}