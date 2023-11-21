import java.util.Scanner;

public class Population{

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter current world population");

double currentWorldPopulation = input.nextDouble();

System.out.println("Enter annual world population growth rate");

double populationGrowthRate = input.nextDouble();

populationGrowthRate *= 100.0;

double numberOfYear = 1;

double estimatedWorldPopulation  = currentWorldPopulation + (numberOfYear  * populationGrowthRate);

double year1 = currentWorldPopulation + (1  * populationGrowthRate);
double year2 = currentWorldPopulation + (2  * populationGrowthRate);
double year3 = currentWorldPopulation + (3  * populationGrowthRate);
double year4 = currentWorldPopulation + (4  * populationGrowthRate); 
double year5 = currentWorldPopulation + (5  * populationGrowthRate);
 

System.out.println("year 1: " + year1 + "  year 2: " + year2 + "  year 3: " + year3 + "  year 4: " + year4 + "  year 5: " + year5);

}
}