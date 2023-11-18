import java.util.Scanner;

public class Divisible {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter preferred Integer: ");

int divide = input.nextInt();

int remainder = divide % 3;

if (remainder == 0) System.out.println("Number " + divide + " is divisible by 3");

else {
System.out.println(divide + "is not divisible by 3");
}
}
}