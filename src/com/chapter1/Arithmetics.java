package com.chapter1;
/*(Arithmetic) Write an application that asks the user to enter two
integers, obtains them from the user and prints their sum, product,
difference and quotient (division).

 */
import java.util.Scanner;
public class Arithmetics {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a, b, sum, product, quotient,average;
        System.out.print("Enter value of a: ");
        a = sc.nextInt();
        System.out.print("Enter value of b: ");
        b = sc.nextInt();
        sum = a + b;
        product = a * b;
        quotient = a/b;
        average = (sum)/2;

        System.out.printf("The sum of a %d and b %d = %d%n", a,b,sum);
        System.out.printf("The product of a %d and b %d = %d%n", a,b,product);
        System.out.printf("The quotient of a %d and b %d = %d%n", a,b,quotient);
        System.out.printf("The average of a %d and b %d = %d%n", a,b,average);

        if(a > b)
            System.out.println(a +" is larger");
        if(a < b)
            System.out.println(a + " is smaller");

        sc.close();
    }

}
