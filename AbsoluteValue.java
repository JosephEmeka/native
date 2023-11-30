import java.util.Scanner;

public class AbsoluteValue{

public static void main(String[]arg){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter Prefered number: ");

	int value = input.nextInt();


	int myAbsoluteValue = value - 0;

		if (value <= -1) {

			 myAbsoluteValue = (-1 * myAbsoluteValue);

}

		if (value == 0) {
		
		myAbsoluteValue = 0;

}

System.out.println("Absolute Value = " + myAbsoluteValue);

	}


}
	
	
