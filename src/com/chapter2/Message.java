package com.chapter2;
/*Write Java statements that accomplish each of the following tasks:
1. Display the message "Enter an integer: ", leaving the
cursor on the same line.
2. Assign the product of variables b and c to the int variable a.
3. Use a comment to state that a program performs a sample payroll
calculation.

 */
import java.util.Scanner;
//Sample payroll calculation.
public class Message {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a;
        System.out.print("Enter an Integer1: ");
        int b =sc.nextInt();
        System.out.print("Enter an Integer2: ");
        int c =sc.nextInt();
        int d;
        d = b * c;
        a = d;

        System.out.printf("The product of two integer b & c is d:%d %d %d%n",b,c,d);
        System.out.printf("The value of a is d: %d %d%n",a,d);

        sc.close();
    }
}
