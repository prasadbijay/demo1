package com.lab4;

interface PaymentMethod {
    void makePayment(double amount);
    void printReceipt();
}
class CreditCardPayment implements PaymentMethod {
    @Override
    public void makePayment(double amount) {
        System.out.println(" Payment of " + amount + " made using Credit Card: ");
    }

    @Override
    public void printReceipt() {
        System.out.println(" Credit Card Payment Receipt: ");
    }
}
class PayPalPayment implements PaymentMethod {
    @Override
    public void makePayment(double amount) {
        System.out.println(" Payment of " + amount + " made using PayPal: ");
    }

    @Override
    public void printReceipt() {
        System.out.println(" PayPal Payment Receipt: ");
    }
}
public class TestMain {
    public static void main(String[] args) {
    	
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod payPal = new PayPalPayment();
        PaymentMethod[] payments = { creditCard, payPal };
        for (PaymentMethod payment : payments) {
            payment.makePayment(100.0);
            payment.printReceipt();
            System.out.println();
        }
    }
}