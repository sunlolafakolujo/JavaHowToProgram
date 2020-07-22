package com.chapter3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountTest {

    Account account;

    @BeforeEach
    void setUp() {
        System.out.println("Running!!!");
       account = new Account();
    }


    @AfterEach
    void tearDown() {
    }

    @Test
    void confirmAccountClassIsNotNullTest(){
        assertNotNull(account);
    }
    @Test
    void accountDepositTest(){
        account.setBalance(1000);
        assertEquals(1000,account.getBalance());

        account.depositAmount(5000);
        assertEquals(6000,account.getBalance());
    }
    @Test
    void amountToWithdrawWithPinTest(){
        account.depositAmount(6000);
        assertEquals(6000,account.getBalance());
        account.setPin(1111);
        account.amountToWithdraw(1111,1000);
        assertEquals(5000,account.getBalance());
    }


}
