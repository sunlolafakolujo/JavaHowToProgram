package com.chapter3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HeartProfileTest {
    HeartProfile heartProfile;
    @BeforeEach
    void setUp() {
        heartProfile = new HeartProfile();
        System.out.println("Heart profile calculator is working");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void heartProfileClassIsNotNullTest(){
       assertNotNull(heartProfile);
    }
    @Test
    void personAgeVerificationTest(){
        heartProfile.setDayOfBirth(4);
        heartProfile.getDayOfBirth();
        heartProfile.setMonthOfBirth(7);
        heartProfile.getMonthOfBirth();
        heartProfile.setYearOfBirth(2000);
        heartProfile.getYearOfBirth();
        assertEquals(20,heartProfile.age());

    }

    @Test
    void personMaximumHeartRateTest(){
        heartProfile.setDayOfBirth(4);
        heartProfile.getDayOfBirth();
        heartProfile.setMonthOfBirth(7);
        heartProfile.getMonthOfBirth();
        heartProfile.setYearOfBirth(2000);
        heartProfile.getYearOfBirth();
        assertEquals(200, heartProfile.maxHeartRate());

    }

    @Test
    void personTargetHeartRateTest(){
        assertEquals(84,heartProfile.targetHeartRate(50));
    }

    @Test
    void personBMIVerificationTest(){
        heartProfile.setWeight(76);
        heartProfile.getWeight();
        heartProfile.setHeight(5);
        heartProfile.getHeight();
        assertEquals(3.04,heartProfile.bmi());
    }
}
