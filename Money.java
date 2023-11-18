import java.util. Scanner;

public class CurrencyConverter {

public static void main (String [] arg) {


Scanner input = new Scanner(System.in);

System.out.println("Enter Exchange rate: ");

int exchangeRate = input.nextInt();

System.out.println("Enter 0 to convert from U.S dollars to Chinese RMB: ");

int dollarToRmb = input.nextInt();

System.out.println("Enter 1 to convert from chinese RMB to U.S dollars: ");

int rmbToDollar = input.nextInt();

if (dollarToRmb == 0){
  
system.out.println("Enter Dollar amount: ");

double dollarAmount = input.nextDouble();

conversionResult = dollarAmount * 6.81;
} 

if (rmbToDollar == 1){
  
system.out.println("Enter RMB amount: ");

double rmbAmount = input.nextDouble();

conversionResult2 = rmbAmount/ 6.81;
} 


}

}