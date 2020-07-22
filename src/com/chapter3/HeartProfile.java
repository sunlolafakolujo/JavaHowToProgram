package com.chapter3;
import java.time.Period;
import java.time.LocalDate;

/*(Computerization of Health Records) A health-care issue that has been in the news lately is
the computerization of health records. This possibility is being approached cautiously because of
sensitive privacy and security concerns, among others. [We address such concerns in later exercises.]
Computerizing health records could make it easier for patients to share their health profiles and histories
among their various health-care professionals. This could improve the quality of health care,
help avoid drug conflicts and erroneous drug prescriptions, reduce costs and, in emergencies, could
save lives. In this exercise, you’ll design a “starter” HealthProfile class for a person. The class attributes
should include the person’s first name, last name, gender, date of birth (consisting of separate attributes for
the month, day and year of birth), height (in inches) and weight (in pounds). Your class
should have a constructor that receives this data. For each attribute, provide set and get methods.
The class also should include methods that calculate and return the user’s age in years, maximum
heart rate and target-heart-rate range (see Exercise 3.16), and body mass index.
Write a Java app that prompts for the person’s information, instantiates an object of
class HealthProfile for that person and prints the information from that object—including the person’s
first name, last name, gender, date of birth, height and weight—then calculates and prints the
person’s age in years, BMI, maximum heart rate and target-heart-rate range. It should also display
the BMI values chart.
 */

public class HeartProfile {

    private String firstName;
    private String lastName;
    private String gender;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private int height;
    private int weight;

    public HeartProfile(String firstName, String lastName, String gender, int dayOfBirth, int monthOfBirth,
                        int yearOfBirth, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
        this.weight = weight;
    }

    public HeartProfile() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int age() {
        LocalDate currentDate = LocalDate.of(yearOfBirth,monthOfBirth,dayOfBirth);
        LocalDate dateOfBirth = LocalDate.now();

        if(currentDate != null && dateOfBirth !=null)
            return Period.between(currentDate,dateOfBirth).getYears();
        else
            return 0;
    }


    public int maxHeartRate() {
        final int beat =220;

        return beat - age();
    }

    public double targetHeartRate(int percentageRange) {

        if(percentageRange >50 || percentageRange <=85)
            return (maxHeartRate() * percentageRange/100);
        else
            return 0;
    }

    public double bmi() {
       return weight/(Math.pow(height,2));
    }
}
