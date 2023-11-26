import java.util.Scanner;

public class Prime{

public static void main (String[]arg){

System.out.println("Enter preferred number: ");

Scanner input = new Scanner(System.in);

int number = input.nextInt();

if (number % 2 == 0 && number >  0)

System.out.println ("number is a prime number");

else

System.out.println ("number is not a prime number");


    }


}