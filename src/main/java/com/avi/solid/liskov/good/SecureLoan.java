package com.avi.solid.liskov.good;


public interface SecureLoan extends LoanPayment {
    public void foreCloseLoan();
}
