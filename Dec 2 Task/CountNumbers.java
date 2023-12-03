import java.util.Scanner;

public class CountNumbers{

	public static void main (String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Number of input: ");

		int myNum = input.nextInt();
		int numberOfInput = 0;
		int zeros = 0;
		int countPositive=0;
		int countNegative=0;

						do {
		System.out.println("Enter Preferred Number: ");
		int preferredNumber = input.nextInt();
			if (preferredNumber <= -1)
				countNegative++;
			if (preferredNumber >= 1)
				countPositive++;
			if (preferredNumber == 0)
				zeros++;
			numberOfInput++;  
		}while (numberOfInput < myNum);




System.out.printf("Number of Postive numbers is: %d%nNumber of Negative numbers is: %d%nNumber of Zeros is: %d", countPositive, countNegative, zeros);

}

}