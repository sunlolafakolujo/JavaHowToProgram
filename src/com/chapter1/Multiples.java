package com.chapter1;
/*Write an application that reads two integers, determines whether the first number tripled is a multiple of the second
number doubled, and prints the result. [Hint: Use the remainder operator.]
 */
import java.util.Scanner;
public class Multiples {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        int tripleA = 3*a;
        int doubleB = 2*b;

        int result =doubleB%tripleA;
        System.out.println(result);
        if(result==0)
            System.out.println("Tripled of "+ a+" is a multiple of "+ b+" doubled");

    }
}
