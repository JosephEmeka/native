import java.util. Scanner;

public class CurrencyConverter{

public static void main (String [] arg) {

Scanner input = new Scanner(System.in);

System.out.println("Enter Exchange rate: ");

float exchangeRate = input.nextFloat();

System.out.println("Enter 0 to convert from U.S dollars to Chinese RMB or 1 to convert from Chinese RMB to US dollar: ");

int dollarToRmb = input.nextInt();

if (dollarToRmb == 0) {
 
System.out.println("Enter Dollar amount: ");

float dollarAmount = input.nextFloat();

float conversionResult = dollarAmount * exchangeRate;
System.out.printf("%.1f is %.1f Yuan", dollarAmount, conversionResult);

} 

else 

{

System.out.println("Enter RMB amount: ");

float rmbAmount = input.nextFloat();

float conversionResult2 = rmbAmount/ exchangeRate;
System.out.printf("%.1f Yuan is %.2f", rmbAmount, conversionResult2);
} 

}

}