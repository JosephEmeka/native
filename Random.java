import java.util.Scanner;

public class Random{

public static void main (String[]arg){

Scanner input = new Scanner(System.in);

int randomNumber = (int) (Math.random() * 2);

System.out.println("Enter guess in figures Head(0) or tail (1):  ");

int guess = input.nextInt();


if (randomNumber == guess) System.out.print("guess is correct");

else {
            System.out.println("Sorry, your guess is incorrect. The correct number was: " + randomNumber);
        } 
}
}