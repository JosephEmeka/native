import java.util.Scanner;

public class UserMultiplicationTable{

public static void main (String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter integer between 1 and 10: ");

int integer = input.nextInt();

int counter = 1;

while (integer < 1 ) {
	
	System.out.println("Follow the instruction and try again!!! ");
	  	
		System.out.println("Enter integer between 1 and 10: ");

			 integer = input.nextInt();
}

 for ( counter = 1; counter <= 12; counter++) {
            
		System.out.println(integer + " * " + counter + " = " + (integer * counter) );
	
		}

	}

}