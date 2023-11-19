import java.util.Scanner;
public class Largest {
public static void main (String[]arg) {

Scanner input = new Scanner(System.in);

System.out.println("Enter first integer: ");
int firstInteger = input.nextInt();

System.out.println("Enter Second integer: ");
int secondInteger = input.nextInt();

System.out.println("Enter Third integer: ");
int thirdInteger = input.nextInt();

int sum = firstInteger + secondInteger + thirdInteger;

int average = sum/3;

int product = firstInteger * secondInteger * thirdInteger;


int smallest = firstInteger;
        if (secondInteger < smallest) {
            smallest = secondInteger;
        }
        if (thirdInteger < smallest) {
            smallest = thirdInteger;
        }

        int largest = firstInteger;
        if (secondInteger > largest) {
            largest = secondInteger;
        }
        if (thirdInteger > largest) {
            largest = thirdInteger;
        }

        
        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Average: %d%n", average);
        System.out.printf("Product: %d%n", product);
        System.out.printf("Smallest: %d%n", smallest);
        System.out.printf("Largest: %d%n", largest);


}
}