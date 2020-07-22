package com.chapter3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class InvoiceTest {

    Invoice invoice;

    @BeforeEach
    void setUp() {
        System.out.println("Invoice Test is running!!!");
        invoice = new Invoice();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void confirmInvoiceClassIsNotNullTest(){
        assertNotNull(invoice);
    }

    @Test
    void partNumberVerificationTest(){
        String partNumber ="001";
        invoice.setPartNumber(partNumber);
        assertEquals("001",invoice.getPartNumber());
    }

    @Test
    void partDescriptionVerificationTest(){
        String partDescription ="Bolt";
        invoice.setPartDescription(partDescription);
        assertEquals("Bolt",invoice.getPartDescription());
    }

    @Test
    void quantityVerificationTest(){
        int itemQuantity =2;
        invoice.setQuantity(itemQuantity);
        assertEquals(2,invoice.getQuantity());
    }

    @Test
    void priceVerificationTest(){
        double itemPrice = 1;
        invoice.setPrice(itemPrice);
        assertEquals(1,invoice.getPrice());
    }

    @Test
    void invoiceAmountVerificationTest(){
        invoice.setQuantity(2);
        invoice.getQuantity();
        invoice.setPrice(234);
        invoice.getPrice();
        assertEquals(468,invoice.getInvoiceAmount());
    }






}
