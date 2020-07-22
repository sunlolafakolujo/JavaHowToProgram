package com.chapter3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    Date date;

    @BeforeEach
    void setUp() {
        date = new Date();
        System.out.println("Date class is running");
    }

    @AfterEach
    void tearDown() {

     }

     @Test
    void dateClassIsNotNullTest(){
        assertNotNull(date);
     }

     @Test
    void displayDateVerificationTest(){
        date.setDay(1);
        date.getDay();
        date.setMonth(2);
        date.getMonth();
        date.setYear(2020);
        date.getYear();
        assertEquals("1:2:2020",date.displayDate());
       // assertEquals("01:02:2020",date.displayDate());
     }

}