import java.util.Scanner;

public class Arithmethic{

public static void main(String [] args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter first Integer: ");

int firstInteger = input.nextInt();

System.out.println("Enter second Integer: ");

int secondInteger = input.nextInt();

int firstIntegerSquare = firstInteger * firstInteger;

System.out.println("square of first integer is: " + firstIntegerSquare);


int secondIntegerSquare = secondInteger * secondInteger;

System.out.println("square of second integer is: " + secondIntegerSquare);

int sumOfSquares =firstIntegerSquare + secondIntegerSquare;

System.out.println("The sum of their squares is: " + sumOfSquares);

int differenceOfSquares = firstIntegerSquare - secondIntegerSquare;

System.out.println("The difference of their squares is: " + differenceOfSquares);

}








}