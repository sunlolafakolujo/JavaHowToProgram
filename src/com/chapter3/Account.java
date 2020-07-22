package com.chapter3;
/*Modify class Account (Fig. 3.8) to provide a method called withdraw
that withdraws money from an Account. Ensure that the withdrawal amount does not exceed
the Account’s balance. If it does, the balance should be left unchanged and the method should print
a message indicating "Withdrawal amount exceeded account balance." Modify class AccountTest
(Fig. 3.9) to test method withdraw.

 */

public class Account {

    private String name;
    private double balance;
    private int pin;

    public Account(String name, double balance, int pin) {
        this.name = name;
        this.pin = pin;

        if(balance >0.00)
        this.balance = balance;
    }

    public Account() {

    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {

        if(balance > 0.00)
        this.balance = balance;
    }

    public void depositAmount(double amountToDeposit) {

        if(amountToDeposit >0.00)
            balance = balance + amountToDeposit;
    }

    public void amountToWithdraw(int myPin,double withdrawalAmount) {

        if(pin == myPin && balance -withdrawalAmount>999)
            balance = balance -withdrawalAmount;
    }
}
