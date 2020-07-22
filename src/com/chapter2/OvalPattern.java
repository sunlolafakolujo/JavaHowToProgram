package com.chapter2;

public class OvalPattern {

    public static void main(String[] args){
        int row, col, space;
        for(row =1; row <=5; row++){
            for(space =1; space <=(2*row)+1; space++){
                    System.out.print(" ");
            }
            for(col =1; col<=row+2; col++) {

                    System.out.print("*");

            }
            System.out.println();
        }
    }
}
