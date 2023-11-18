import java.util.Scanner;

public class Program{

public static void main (String[] args) {

Scanner input = new Scanner(System.in);

System.out.println(" Enter preferred integer: ");

int number = input.nextInt();

if (number % 5 == 0 && number % 6 == 0);{ 

 System.out.println ("is " + number + " divisible by 5 and 6?");
 System.out.println (True);
}

if (number % 5 == 0 || number % 6 == 0) System.out.println ("is " + number + " divisible by 5 or 6? True ");

if (number % 5 == 0 || number % 6 == 0) System.out.println ("is " + number + " divisible by 5 or 6, but not both? True ");



}

}