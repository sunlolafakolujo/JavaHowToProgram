package com.chapter3;

public class Account1 {

    private String accountName;
    private double accountBalance;

    public Account1(String accountName, double accountBalance) {
        this.accountName = accountName;
        if(accountBalance >0)
        this.accountBalance = accountBalance;
    }
    public Account1() {

    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        if(accountBalance >0)
        this.accountBalance = accountBalance;
    }


    public void accountDeposit(double deposit) {
        if(deposit >0)
            accountBalance = accountBalance + deposit;
    }
}
