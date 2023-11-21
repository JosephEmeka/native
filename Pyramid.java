import java.util.Scanner;

public class Pyramid{

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter  Estimated number of stones used");

double numberOfStones = input.nextDouble();


System.out.println("Enter Average weight of each stone");

double averageWeight = input.nextDouble();


System.out.println("Enter Number of years taken to build the pyramid");

double numberOfYears = input.nextDouble();



double yearlyWeight = (numberOfStones * averageWeight) / numberOfYears;


double hourlyWeight = yearlyWeight/ 8760;


double minuteWeight =  yearlyWeight/525600;



System.out.printf("Yearly weight: %.2f%nHour weight: %.2f%nminute weight: %.2f%n",  yearlyWeight, hourlyWeight, minuteWeight);


}
}