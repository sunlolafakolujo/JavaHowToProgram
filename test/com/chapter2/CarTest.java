package com.chapter2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarTest {
    Car car;
    Car car1;
    @BeforeEach
    void setUp() {

        car = new Car();
        car1 = new Car("Toyota","2000",1200000);

        System.out.println("Car test is running");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void carObjectIsNotNullTest(){
        assertNotNull(car);
        assertNotNull(car1);
    }

    @Test
    void carModelVerificationTest(){
        car.setCarModel("Honda CRV");
        assertEquals("Honda CRV",car.getCarModel());
    }

    @Test
    void carYearVerificationTest(){
        car.setCarYear("2020");
        assertEquals("2020",car.getCarYear());
    }

    @Test
    void carPriceVerificationTest(){
        car.setCarPrice(5000000);
        assertEquals(5000000,car.getCarPrice());
    }


    @Test
    void carPriceDiscountedVerificationTest(){
        int discount1 = 5;
        car.setCarPrice(5000000);
        car.getCarPrice();
        assertEquals(4750000, car.discountedPrice(discount1));

        int discount2 = 7;
        car.setCarPrice(5000000);
        car.getCarPrice();
        assertEquals(4650000, car.discountedPrice(discount1));


    }

    @Test
    void carDisplayVerificationTest(){
        System.out.printf("%s%15s%20f%n",car1.getCarModel(),car1.getCarYear(),car1.getCarPrice());
        //Discounted price of 5%
        System.out.printf("%s%15s%20f%n",car1.getCarModel(),car1.getCarYear(),(car1.getCarPrice()-(car1.getCarPrice()*5/100)));
        //Discounted price of 7%
        System.out.printf("%s%15s%20f%n",car1.getCarModel(),car1.getCarYear(),(car1.getCarPrice()-(car1.getCarPrice()*7/100)));
    }
}
