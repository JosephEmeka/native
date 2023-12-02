import java.util.Scanner;

public class HeartRatesApp {

	public static void main (String[] args){

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first name: ");
        	String firstName = input.nextLine();

        	System.out.print("Enter last name: ");
        	String lastName = input.nextLine();

        	System.out.print("Enter birth month (1-12): ");
        	int birthMonth = input.nextInt();

        	System.out.print("Enter birth day: ");
        	int birthDay = input.nextInt();

        	System.out.print("Enter birth year: ");
        	int birthYear = input.nextInt();

				

		HeartRates myHeartRate = new HeartRates (firstName, lastName, birthYear, birthMonth, birthDay);

			System.out.printf("First name:%s%nLast Name:%s", myHeartRate.getFirstName(), myHeartRate.getFirstName());

                        System.out.printf("Age:%s%nMaximum Heart rate:%s%nTarget Heart rate:%s", myHeartRate.getAge(), myHeartRate.findMaximumHeartRate(), myHeartRate.TargetHeartRate());


	}

}