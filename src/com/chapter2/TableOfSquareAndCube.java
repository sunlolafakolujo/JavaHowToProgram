package com.chapter2;

public class TableOfSquareAndCube {
    public static void main(String[] args){
        int i;
        System.out.printf("%s%20s%20s%n","number","square","cube");
        for(i=0; i<=10;i++) {

            System.out.printf("%d%20d%20d%n", i, (int)Math.pow(i, 2), (int)Math.pow(i, 3));
        }
    }
}
