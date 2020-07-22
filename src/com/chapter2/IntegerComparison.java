package com.chapter2;
/*(Comparing Integers) Write an application that asks the user to enter
two integers, obtains them from the user and displays the larger number
followed by the words "is larger". If the numbers are equal, print the
message "These numbers are equal".
 */
import java.util.Scanner;
public class IntegerComparison {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of a: ");
        int b = sc.nextInt();

        if(a == b)
            System.out.println("These numbers are equal");

        if(a > b)
            System.out.println("a is larger");

        if(a < b)
            System.out.println("a is larger");

        sc.close();
    }
}
