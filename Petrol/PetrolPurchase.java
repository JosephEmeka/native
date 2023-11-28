import java.util.Scanner;
public class PetrolPurchase {

	private String stationLocation;
	private String petrolType;
	private int quantity;
	private double price;
	private double percentageDiscount;
	

			
public PetrolPurchase (String stationLocation, String petrolType, int quantity, double price, double percentageDiscount) { 
	
		this.stationLocation = stationLocation;

		this.petrolType      = petrolType;


		if (quantity > 0) {
                	this.quantity = quantity;
			}
	        
		
		if (price > 0.0) {
                	this.price = price;
                        }
		
                    
		if (percentageDiscount > 0.0) {
                	this.percentageDiscount = percentageDiscount;
                        }
		

}


public void setStationLocation(String stationLocation) {

		this.stationLocation = stationLocation;
		
	}


public String getStationLocation (){
		
		return stationLocation;

	}



public void setPetrolType(String petrolType) {

		this.petrolType = petrolType;

	}


public String getPetrolType(){

		return petrolType;

	}



public void setQuantity (int quantity){

		this.quantity = quantity;
	}


public int getQuantity(){
	
		return quantity;

	}


public void setPrice(double price) {
	
		this.price = price;

	}


public double getPrice(){
		
		return price;

	}

public void setPercentageDiscount(double percentageDiscount) {


		 {
		
		this.percentageDiscount = percentageDiscount;
		
		}

	}


public double getPercentageDiscount(){
	
		return percentageDiscount;

	}


public double getPurchaseAmount(){		
		
      return (quantity * price) - ((quantity * price * percentageDiscount) / 100);

	


}

}
		
