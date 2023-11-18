import java.util.Scanner;

public class Calender{

public static void main (String[] args) {

Scanner input = new Scanner(System.in);

System.out.println(" Enter Month Number between 1 and 12: ");

double number = input.nextDouble();

if (number == 1) System.out.println("January");
if (number == 2) System.out.println("February");
if (number == 3) System.out.println("March");
if (number == 4) System.out.println("April");
if (number == 5) System.out.println("May");
if (number == 6) System.out.println("June");
if (number == 7) System.out.println("July");
if (number == 8) System.out.println("August");
if (number == 9) System.out.println("September");
if (number == 10) System.out.println("October");
if (number == 11) System.out.println("November");
if (number == 12) System.out.println("December");
if (number > 12) System.out.println("Invalid number");


}
}