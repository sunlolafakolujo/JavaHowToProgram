package com.chapter3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Account1Test {
    Account1 account;
    @BeforeEach
    void setUp() {
        account = new Account1();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void accountIsNotNullTest(){
        assertNotNull(account);
    }

    @Test
    void accountDepositTest(){
        double deposit =1000;
        account.accountDeposit(deposit);
        assertEquals(1000,account.getAccountBalance());

    }

    @Test
    void displayAccountVerificationTest(Account1 accountToDisplay){
        accountToDisplay.setAccountName("Sunlola");
        assertEquals("Sunlola",accountToDisplay.getAccountName());


    }

}
