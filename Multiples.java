import java.util.Scanner;

public class Multiples{

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter first integer");

int firstInteger = input.nextInt();

System.out.println("Enter Second Integer");

int secondInteger = input.nextInt();

int tripleFirstInteger = 3 * firstInteger;

int doubleSecondInteger = 2 * secondInteger;

if (doubleSecondInteger % tripleFirstInteger == 0)

System.out.println("Tripple first number " + tripleFirstInteger + " is a multiple of double second number " + doubleSecondInteger);



}





}