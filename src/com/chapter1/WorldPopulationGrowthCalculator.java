package com.chapter1;
import java.util.Scanner;
/*(World Population Growth Calculator) Use the web to determine the current world population
and the annual world population growth rate. Write an application that inputs these values,
then displays the estimated world population after one, two, three, four and five years.
 */

public class WorldPopulationGrowthCalculator {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter estimated current year population: ");
        String currentYearPopulation =sc.next();
        double populationNumber = Double.parseDouble(currentYearPopulation);

        System.out.print("Enter population count in thousand, million, billion, trillion etc.: ");
        String count = sc.next();

        double averageEstimatedPopulationYearlyIncrease =1.021;

        double yearTwoPopulation = populationNumber * averageEstimatedPopulationYearlyIncrease;
        double yearThreePopulation = yearTwoPopulation * averageEstimatedPopulationYearlyIncrease;
        double yearFourPopulation = yearThreePopulation * averageEstimatedPopulationYearlyIncrease;
        double yearFivePopulation = yearFourPopulation * averageEstimatedPopulationYearlyIncrease;


        System.out.println();

        System.out.printf("%s%41s%18s%n","Year","Population","In");
        System.out.printf("%s%26s%30s%n","Current Year",currentYearPopulation,count);
        System.out.printf("%s%35f%25s%n","Year Two",yearTwoPopulation,count);
        System.out.printf("%s%33f%25s%n","Year Three",yearThreePopulation,count);
        System.out.printf("%s%34f%25s%n","Year Four",yearFourPopulation,count);
        System.out.printf("%s%34f%25s%n","Year Five",yearFivePopulation,count);


        sc.close();
    }
}
