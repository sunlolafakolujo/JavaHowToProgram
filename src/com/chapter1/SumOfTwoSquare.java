package com.chapter1;
//Program to calculate diff of two squares.
import java.util.Scanner;
public class SumOfTwoSquare {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        int squareOfA = a * a;
        int squareOfB = b * b;
        int diffOfSquare = squareOfA - squareOfB;

        System.out.printf("Square of A is: %d%nSquare of B is: %d%n",squareOfA,squareOfB);
        System.out.printf("Diff. in square is: %d%n",diffOfSquare);

        sc.close();
    }
}
