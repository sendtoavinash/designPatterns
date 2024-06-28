package com.avi.designPatterns.behavioral.chainOfResponsibility;

public class BankPaymentHandler extends PaymentHandler{
    public void handlePayment(double amount) {
        if (amount <= 500) {
            System.out.println("Paid using bank account: $" + amount);
        } else {
            next.handlePayment(amount);
        }
    }
}
