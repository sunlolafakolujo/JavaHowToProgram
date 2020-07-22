package com.chapter3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TargetHeartRateCalculatorTest {

    TargetHeartRateCalculator targetHeartRateCalculator;

    @BeforeEach
    void setUp() {
        targetHeartRateCalculator = new TargetHeartRateCalculator();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void confirmTargetHeartRateCalculatorIsNotNull(){
       assertNotNull(targetHeartRateCalculator);
    }

    @Test
    void personAgeVerificationTest(){
        targetHeartRateCalculator.setDayOfBirth(4);
        targetHeartRateCalculator.getDayOfBirth();
        targetHeartRateCalculator.setMonthOfBirth(7);
        targetHeartRateCalculator.getMonthOfBirth();
        targetHeartRateCalculator.setYearOfBirth(1974);
        targetHeartRateCalculator.getYearOfBirth();
        assertEquals(46,targetHeartRateCalculator.age());
    }

    @Test
    void personMaxHeartRateVerificationTest(){
        targetHeartRateCalculator.setYearOfBirth(2000);
        targetHeartRateCalculator.getYearOfBirth();
        targetHeartRateCalculator.setMonthOfBirth(7);
        targetHeartRateCalculator.getMonthOfBirth();
        targetHeartRateCalculator.setDayOfBirth(4);
        targetHeartRateCalculator.getDayOfBirth();


        assertEquals(200, targetHeartRateCalculator.maxHeartRate());

    }

    @Test
    void personTargetHeartRateTest(){
        targetHeartRateCalculator.setYearOfBirth(2000);
        targetHeartRateCalculator.getYearOfBirth();
        targetHeartRateCalculator.setMonthOfBirth(7);
        targetHeartRateCalculator.getMonthOfBirth();
        targetHeartRateCalculator.setDayOfBirth(4);
        targetHeartRateCalculator.getDayOfBirth();
        targetHeartRateCalculator.maxHeartRate();

        assertEquals(100,targetHeartRateCalculator.targetHeartRate(50));
    }


}
