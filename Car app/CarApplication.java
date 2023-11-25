import java.util.Scanner;

public class CarApplication {

public static void main(String[]arg){

Scanner input = new Scanner(System.in);

Car myCar1 = new Car("Camry", "2021");

Car myCar2 = new Car("Toyota", "19");

System.out.println(myCar1.getModel());

System.out.println(myCar2.getModel());

System.out.println("Enter car name1: ");

String carName1 = input.nextLine();

System.out.println("Enter car name2: ");

String carName2 = input.nextLine();

myCar1.setModel(carName1);

myCar2.setModel(carName2);

myCar1.setPrice(5400000);

myCar2.setPrice(6700000);

System.out.println(myCar1.getPrice());

System.out.println(myCar2.getPrice());

myCar2.setDiscount();

























	}
}