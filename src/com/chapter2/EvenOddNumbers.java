package com.chapter2;
/*(Odd or Even) Write an application that reads an integer and
determines and prints whether it’s odd or even. [Hint: Use the remainder
operator. An even number is a multiple of 2. Any multiple of 2 leaves a
remainder of 0 when divided by 2.]
 */
import java.util.Scanner;
public class EvenOddNumbers {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value of number: ");
        int number = sc.nextInt();

        if(number%2==0)
            System.out.println(number +" is divisible by 2");
        if(number%3==0)
            System.out.println(number +" is divisible by 3");

        sc.close();

    }
}

