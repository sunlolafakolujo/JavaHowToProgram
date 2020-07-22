package com.chapter1;
import java.util.Scanner;
public class ComparingIntegers {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        int squareOfA = a * a;

        if(a == 100 && squareOfA ==100)
            System.out.printf("%d =100 %n%d=100",a,squareOfA);
        if(a <100 && squareOfA<100)
            System.out.printf("%n%d <100 %n%d<100",a,squareOfA);
        if(a >100 && squareOfA >100)
            System.out.printf("%n%d >100%n%d>100",a,squareOfA);
        if(a !=100 && squareOfA !=100)
            System.out.printf("%n%d !=100%n%d!=100",a,squareOfA);

        sc.close();
    }
}
