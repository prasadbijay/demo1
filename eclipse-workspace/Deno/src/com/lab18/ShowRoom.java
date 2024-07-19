package com.lab18;

import java.util.Scanner;

public class ShowRoom {
    String name;
    long mobNo;
    double cost;
    double amount;

    ShowRoom() {
        this.name = "";
        this.mobNo = 0;
        this.cost = 0.0;
        this.amount = 0.0;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        this.name = sc.nextLine();
        System.out.println("Enter mobile number:");
        this.mobNo = sc.nextLong();
        System.out.println("Enter cost:");
        this.cost = sc.nextDouble();
    }

    public void calculate() {
        double discount = 0.0;

        if (cost <= 10000) {
            discount = cost * 0.05;
        } else if (cost > 10000 && cost <= 20000) {
            discount = cost * 0.10;
        } else if (cost > 20000 && cost <= 35000) {
            discount = cost * 0.15;
        } else if (cost > 35000) {
            discount = cost * 0.20;
        }

        amount = cost - discount;
        System.out.println("Discounted amount is: " + discount + " rs.");
    }

    public void display() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Mobile Number: " + mobNo);
        System.out.println("Customer, you need to pay: " + amount + " Rs. after all the discounts.");
    }

    public static void main(String[] args) {
        ShowRoom sr = new ShowRoom();
        sr.input();
        sr.calculate();
        sr.display();
    }
}