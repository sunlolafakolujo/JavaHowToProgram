package com.chapter1;
/*The Great Pyramid of Giza is considered an engineering marvel of its time.
Using the web to get statistics related to the Great Pyramid of Giza, and find the estimated
number of stones used to build it, the average weight of each stone, and the number of years it took to build.
Create an application tha calculate an estimated of how much, by weight of the pyramid was built each year, each hour
and each minute as it was being built. The application should input the following information:
a) Estimated number of stones used.
b) Average weight of each stone.
c) Number of years taken to build the pyramid(Assuming a year comprises 365 days.)
 */

public class StatisticsForTheGreatPyramidOfGiza {

    public static void main(String[] args){

        int estimatedNumberOfYearPyramidGizaWasBuilt =20;
        //weight in millions
        double estimatedWeightOfPyramidOfGiza =6.0;
        //quantity of stones in millions
        double estimatedNumberOfStonesUsed = 2.3;
        //weight of stone in tonnes
        int estimatedWeightOfEachStone =80;

        double howMuchByWeightPyramidWasBuiltEachYear = estimatedWeightOfPyramidOfGiza/estimatedNumberOfYearPyramidGizaWasBuilt;
        double howMuchByWeightPyramidWasBuiltEachHour = estimatedWeightOfPyramidOfGiza/(24 * estimatedNumberOfYearPyramidGizaWasBuilt * 365);
        double howMuchByWeightPyramidWasBuiltEachMinute = estimatedWeightOfPyramidOfGiza/(24 * 60 * 365 * estimatedNumberOfYearPyramidGizaWasBuilt);

        System.out.printf("%s%40s%30s%30s%40s%40s%45s%n","estimatedNumberOfYearPyramidGizaWasBuilt","estimatedWeightOfPyramidOfGiza",
                "estimatedNumberOfStonesUsed","estimatedWeightOfEachStone","howMuchByWeightPyramidWasBuiltEachYear","howMuchByWeightPyramidWasBuiltEachHour"
                ,"howMuchByWeightPyramidWasBuiltEachMinute");
        System.out.printf("%d%56f%33f%25d%34f%40f%43f%n",estimatedNumberOfYearPyramidGizaWasBuilt,estimatedWeightOfPyramidOfGiza,estimatedNumberOfStonesUsed,
                estimatedWeightOfEachStone,howMuchByWeightPyramidWasBuiltEachYear,howMuchByWeightPyramidWasBuiltEachHour,howMuchByWeightPyramidWasBuiltEachMinute);
    }
}
