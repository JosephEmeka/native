import java.util.Scanner;

public class Techniques{

public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.println("Enter first Integer: ");

int firstInteger = input.nextInt();

System.out.println("Enter second Integer");

int secondInteger = input.nextInt();

System.out.println("Enter third Integer");

int thirdInteger = input.nextInt();

int sum = firstInteger + secondInteger + thirdInteger;

int average = (firstInteger + secondInteger + thirdInteger)/3;

int product = firstInteger * secondInteger * thirdInteger;

System.out.println("sum is " + sum + " Average is " + average + " product is "+ product);

if (firstInteger > secondInteger && firstInteger > thirdInteger) System.out.println(firstInteger + " is the largest number");

else if (secondInteger > thirdInteger && secondInteger > firstInteger) 
System.out.println(secondInteger + " is the largest number");


else if (thirdInteger > secondInteger && thirdInteger > firstInteger) 
System.out.println(thirdInteger + " is the largest number");


if (firstInteger < secondInteger && firstInteger < thirdInteger) 
System.out.println(firstInteger + " is the smallest number");

else if (secondInteger < thirdInteger && secondInteger < firstInteger)
System.out.println(secondInteger + " is the smallest number");


else if (thirdInteger < secondInteger  && thirdInteger < firstInteger)
System.out.println(thirdInteger + " is the smallest number");


}

}