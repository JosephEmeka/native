import java.util.Scanner;

public class Celsius{

public static void main (String[] args) {

Scanner input = new Scanner(System.in);

System.out.println(" Enter celsius degree: ");

float celsiusDegree = input.nextFloat();


double fahrenheitDegree = (9.0/5) * celsiusDegree + 32;

System.out.println(celsiusDegree + " is " + fahrenheitDegree + "  Fahreinheit");


}
}