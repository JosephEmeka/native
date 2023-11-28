import java.util.Scanner;

public class Petrol {

public static void main(String[]arg){

Scanner input = new Scanner(System.in);

PetrolPurchase myPetrol1 = new PetrolPurchase(" ", " ", 0, 0.0,0.0);

PetrolPurchase myPetrol2 = new PetrolPurchase(" ", " ", 0, 0.0, 0.0);


System.out.print("Enter Location: ");

String location1 = input.nextLine();

myPetrol1.setStationLocation(location1);

myPetrol1.getStationLocation();

System.out.println(myPetrol1.getStationLocation());





System.out.print("Enter Location for two: ");

String location2 = input.nextLine();

myPetrol2.setStationLocation(location2);

myPetrol2.getStationLocation();

System.out.println(myPetrol2.getStationLocation());


System.out.print("Enter petrol type: ");

String type1 = input.nextLine();

myPetrol1.setPetrolType(type1);

myPetrol1.getPetrolType();

System.out.println(myPetrol1.getPetrolType());



System.out.print("Enter Quantity in Litres: ");

int fuelQuantity = input.nextInt();

myPetrol1.setQuantity(fuelQuantity);

myPetrol1.getQuantity();

System.out.println(myPetrol1.getQuantity());




System.out.print("Enter Price in Naira: ");

double fuelPrice = input.nextDouble();

myPetrol1.setPrice(fuelPrice);

myPetrol1.getPrice();

System.out.println(myPetrol1.getPrice());



System.out.print("Enter Discount: ");

double purchaseDiscount = input.nextDouble();

myPetrol1.setPercentageDiscount(purchaseDiscount);

myPetrol1.getPercentageDiscount();


System.out.println("Discount Price = " + myPetrol1.getPercentageDiscount());

System.out.println("Net Purchase Amount: " + myPetrol1.getPurchaseAmount());

}

}