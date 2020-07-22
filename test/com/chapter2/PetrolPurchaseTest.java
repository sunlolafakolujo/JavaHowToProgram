package com.chapter2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetrolPurchaseTest {

    PetrolPurchase petrolPurchase;


    @BeforeEach
    void setUp() {
        petrolPurchase = new PetrolPurchase();
        System.out.println("petrolPurchaseTest is running!!!");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void petrolStationLocationVerificationTest(){
        petrolPurchase.setPetrolStationLocation("Oshodi");
        assertEquals("Oshodi",petrolPurchase.getPetrolStationLocation());

    }

    @Test
    void petrolTypeVerificationTest(){
        petrolPurchase.setTypeOfPetrol("Diesel");
        assertEquals("Diesel",petrolPurchase.getTypeOfPetrol());
    }

    @Test
    void petrolQuantityVerificationTest(){
        petrolPurchase.setPetrolQuantity(10);
        assertEquals(10,petrolPurchase.getPetrolQuantity());
    }

    @Test
    void petrolPriceVerificationTest(){
        petrolPurchase.setPetrolPrice(120);
        assertEquals(120,petrolPurchase.getPetrolPrice());

    }

    @Test
    void petrolDiscountedTotalPriceVerificationTest(){
        petrolPurchase.setPetrolPrice(145);
        petrolPurchase.getPetrolPrice();
        petrolPurchase.setPetrolQuantity(10);
        petrolPurchase.getPetrolPrice();
        petrolPurchase.setPercentageDiscount(2);
        petrolPurchase.getPercentageDiscount();
        assertEquals(1421,petrolPurchase.getPurchasedAmount());
    }


}
