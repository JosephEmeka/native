import java.util.Scanner;

public class Car{

	private String model;
	private String year;
	private double price;

public Car(String model, String year){
	this.model = model;
	this.year  = year;
	this.price = price;


	}

public void setModel(String model) {

		this.model = model;

	}

public String getModel() {

		return model; 

	}

public void setYear(String year) {

		this.year = year;

	}

public String getYear() {

		return year; 

	}


public void setPrice(double price) {

		if (price >= 1.0) {

		this.price = price;
		

		}

	}

public double getPrice() {

		return price; 

	}


public void setDiscount() {

		if (price >= 1.0) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Discount: ");
		
		double myDiscount = input.nextDouble();

		this.price = ((myDiscount * 0.01 * price) + price);
		
		System.out.println(this.price);

		}


	}

}