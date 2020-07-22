package com.chapter2;
import java.util.Scanner;
/*(Body Mass Index Calculator) We introduced the body mass index (BMI) calculator in
Exercise 1.10. The formulas for calculating BMI are:

BMI =weightInPounds × 703/
    heightInInches × heightInInches
or

BMI =weightInKilograms/
    heightInMeters × heightInMeters

Create a BMI calculator that reads the user’s weight in pounds and height in inches (or, if you prefer,
the user’s weight in kilograms and height in meters), then calculates and displays the user’s
body mass index. Also, display the following information from the Department of Health and
Human Services/National Institutes of Health so the user can evaluate his/her BMI:
BMI VALUES
Underweight: less than 18.5
Normal:      between 18.5 and 24.9
Overweight:  between 25 and 29.9
Obese:       30 or greater
 */

public class BodyMassIndexCalculator {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight: ");
        double weight =sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        //BMI in pounds/inches
        double bmiInPoundPerInch = (weight * 703)/Math.pow(height,2);

        System.out.printf("%s%20s%20s%n","Weight","Height","BMI");
        System.out.printf("%f%20f%22f%n",weight,height,bmiInPoundPerInch);
        System.out.println();

        String bmiCategorization;
        if(bmiInPoundPerInch<18.5) {
            bmiCategorization ="Underweight";
        }
        else if(bmiInPoundPerInch >18.5 && bmiInPoundPerInch<=24.9) {
            bmiCategorization ="Normal weight";
        }
        else if(bmiInPoundPerInch >25.0 && bmiInPoundPerInch<=29.9) {
            bmiCategorization ="Pre-obesity";
        }
        else if(bmiInPoundPerInch >30.0 && bmiInPoundPerInch<=34.9) {
            bmiCategorization ="Obesity class I";
        }
        else if(bmiInPoundPerInch >35.0 && bmiInPoundPerInch<=39.9) {
            bmiCategorization ="Obesity class II";
        }
        else if(bmiInPoundPerInch >40.0 && bmiInPoundPerInch<=49.9) {
            bmiCategorization ="Obesity class III";
        }
        else {
            bmiCategorization ="Obesity class IV";
        }
        System.out.printf("%s%22s%n","BMI in pound","BMI Categorization");
        System.out.printf("%f%20s%n",bmiInPoundPerInch,bmiCategorization);



    }
}
