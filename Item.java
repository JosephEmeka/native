import java.util.Scanner;

public class Item{

public static void main(String[]arg){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter Prefered Item: ");

	String myItem = input.nextLine();


double myPrice = 0;		
double discount = 0;

		while (myPrice == 0 || myPrice <= -1) {

			System.out.println("Enter price again: ");

				myPrice = input.nextDouble();

				 
				
		}

				
			

	while (discount == 0 || discount <= -1) { 


	System.out.println("Enter discount: ");

	discount = input.nextDouble();

 				
			}
			



	double discountPay = ((myPrice) - (myPrice * discount * 0.01));


System.out.println("Item: " + myItem);
System.out.println("price: " + myPrice);
System.out.println("discount: " + discount + "%");
System.out.println("-------------------------------");
System.out.println("Grand Total: " + discountPay);
System.out.println("-------------------------------");


	}

}

