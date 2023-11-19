import java.util.Scanner;

public class Circle{

public static void main(String[]arg){

Scanner input = new Scanner(System.in);

System.out.println("Enter Radius of circle");

int radius = input.nextInt();

double diameter = 2 * radius;

double circumference = 2 * Math.PI * radius;

double area = Math.PI * radius * radius;

System.out.printf("Diameter: %.2f%n", diameter);
System.out.printf("Circumference: %.2f%n", circumference);
System.out.printf("Area: %.2f%n", area);

}
}