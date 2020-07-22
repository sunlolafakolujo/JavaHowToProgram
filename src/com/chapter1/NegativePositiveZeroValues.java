package com.chapter1;
import java.util.Scanner;

/*(Negative, Positive and Zero Values) Write a program that inputs five numbers and determines
and prints the number of negative numbers input, the number of positive numbers input and
the number of zeros input.
 */

public class NegativePositiveZeroValues {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int zeroValues=0, negativeValues=0, positiveValues=0, number;

        System.out.print("Enter limit: ");
        int limit = sc.nextInt();


        for( int i =1; i<= limit; i++) {
            System.out.print("Enter numbers: ");
            number = sc.nextInt();

            if(number ==0)
                zeroValues +=1;

            if(number > 0)
                positiveValues +=1;

            if(number < 0)
                negativeValues += 1;

            System.out.printf("%s%30s%28s%n","Number of zero Values","Number of negative Values","Number of positive Values");
            System.out.printf("%d%28d%30d%n",zeroValues,negativeValues,positiveValues);
        }
        sc.close();
    }

}
