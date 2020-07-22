package com.chapter2;
import java.util.Scanner;
/*Using only the programming techniques you learned in this
chapter, write an application that calculates the squares and cubes of the numbers from 0 to 10 and
prints the resulting values in table format, as shown below.
 */

public class TableOfSquaresAndCubes {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        int number, range;
        System.out.print("Enter numbers range: ");
        range =sc.nextInt();

        System.out.printf("%s%15s%19s%n","number","square","cube");
        for(number=0; number<=range; number++)
        System.out.printf("%d%16d%21d%n",number,(int)(Math.pow(number,2)),(int)(Math.pow(number,3)));

        sc.close();
    }
}
