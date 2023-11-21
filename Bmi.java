import java.util.Scanner;

public class Bmi{

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter User weight in Kilograms");

double userWeight = input.nextDouble();

System.out.println("Enter User height in Meters");

double userHeight = input.nextDouble();

double userBmi = userWeight / (userHeight * userHeight);

if (userBmi < 18.5) 

System.out.printf("BMI IS: %f%n", userBmi );

System.out.println("BMI Categories");
System.out.println("Underweight = <18.5 ");
System.out.println("Normal weight = 18.5–24.9 ");
System.out.println("Overweight = 25–29.9");
System.out.println("Obesity = BMI of 30 or greater");

}
}