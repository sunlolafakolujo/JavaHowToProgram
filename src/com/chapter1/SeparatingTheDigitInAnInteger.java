package com.chapter1;
import java.util.Scanner;

/*Write an application that inputs one number consisting
of five digits from the user, separates the number into its individual digits and prints the digits
separated from one another by three spaces each. For example, if the user types in the number 42339,
the program should print
Assume that the user enters the correct number of digits. What happens when you enter a
number with more than five digits? What happens when you enter a number with fewer than five
digits? [Hint: It’s possible to do this exercise with the techniques you learned in this chapter. You’ll
need to use both division and remainder operations to “pick off ” each digit.]

 */

public class SeparatingTheDigitInAnInteger {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 5 digit number:");
        int number = sc.nextInt();
        int firstDigit = number/10000;

        int secondDigit =(number%10000)/1000;

        int thirdDigit =((number%10000)%1000)/100;

        int fourthDigit = (((number%10000)%1000)%100)/10;

        int fifthDigit = ((((number%10000)%1000)%100)%10)%10;


        System.out.printf("%d%s%d%s%d%s%d%s%d%n",firstDigit," ",secondDigit," ",thirdDigit," ",fourthDigit," ",fifthDigit);

    }
}
