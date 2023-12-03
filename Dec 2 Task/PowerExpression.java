import java.util.Scanner;

public class PowerExpression{

public static void main (String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter first Number: ");

int firstNumber = input.nextInt();

System.out.println("Enter second Number: ");

int secondNumber = input.nextInt();

int result = 1;

for (int num = 1; num <= secondNumber; num++){

 	result = firstNumbercl * result;
}


System.out.printf("%d raised to the power of %d is %d ", firstNumber, secondNumber, result);

}

}