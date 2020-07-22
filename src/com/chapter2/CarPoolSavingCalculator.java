package com.chapter2;

import java.util.Scanner;

/*(Car-Pool Savings Calculator) Research several car-pooling websites. Create an application
that calculates your daily driving cost, so that you can estimate how much money could be saved by
car pooling, which also has other advantages such as reducing carbon emissions and reducing traffic
congestion. The application should input the following information and display the user’s cost per
day of driving to work:
a) Total miles driven per day.
b) Cost per gallon of gasoline.
c) Average miles per gallon.
d) Parking fees per day.
e) Tolls per day.

 */

public class CarPoolSavingCalculator {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mile drive per day: ");
        int totalMilesDrivePerDay = sc.nextInt();

        System.out.print("Enter cost per litre of gasoline: ");
        double costPerLitreOfGasoline = sc.nextInt();

        System.out.print("Enter gallon of gasoline purchased: ");
        int litreOfGasoline = sc.nextInt();

        System.out.print("Enter parking fees per day: ");
        double parkingFeesPerDay = sc.nextInt();

        System.out.print("Enter number of days travelled: ");
        int numberOfDaysTravelled = sc.nextInt();

        System.out.print("Enter tolls fee per day: ");
        double tollFeesPerDay = sc.nextInt();

        double averageMilesPerLitre = totalMilesDrivePerDay/litreOfGasoline;

        double drivingCost = (double)((totalMilesDrivePerDay * litreOfGasoline * (costPerLitreOfGasoline/totalMilesDrivePerDay) * numberOfDaysTravelled) +
                (parkingFeesPerDay * numberOfDaysTravelled) + (tollFeesPerDay * numberOfDaysTravelled));

        System.out.printf("%s%20s%30s%30s%30s%30s%30s%30s%n","totalMilesDrivePerDay","litreOfGasoline",
                "averageMilesPerLitre","costPerLitreOfGasolinePerMile","numberOfDaysTravelled","parkingFeesPerDay","tollFeesPerDay","drivingCost");

        System.out.printf("%d%26d%31f%30f%22d%44f%32f%30f%n",totalMilesDrivePerDay,litreOfGasoline,
                averageMilesPerLitre,(costPerLitreOfGasoline/totalMilesDrivePerDay),numberOfDaysTravelled,parkingFeesPerDay,tollFeesPerDay,drivingCost);






        sc.close();
    }
}
