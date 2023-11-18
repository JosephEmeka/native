import java.util.Scanner;

public class RockPaper {

public static void main (String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter player one name: ");

String playerOne = input.nextLine();

System.out.println("Enter player two name: ");

String playerTwo = input.nextLine();

System.out.println(playerOne + " Enter a number 0, 1, or 2: ");

int playerOneInt = input.nextInt();

System.out.println(playerTwo + " Enter a number 0, 1, or 2: ");

int playerTwoInt = input.nextInt();

if (playerOneInt == 0 && playerTwoInt == 0) System.out.println(playerOne + "  " + playerTwo + " Draw");
if (playerOneInt == 0 && playerTwoInt == 1) System.out.println(playerTwo + " wins");
if (playerOneInt == 0 && playerTwoInt == 2) System.out.println(playerOne + " wins");

if (playerOneInt == 1 && playerTwoInt == 0) System.out.println(playerOne + " wins");
if (playerOneInt == 1 && playerTwoInt == 1) System.out.println(playerOne + "  " + playerTwo + " Draw");
if (playerOneInt == 1 && playerTwoInt == 2) System.out.println(playerTwo + " wins");

if (playerOneInt == 2 && playerTwoInt == 0) System.out.println(playerTwo + " wins");
if (playerOneInt == 2 && playerTwoInt == 1) System.out.println(playerOne + " wins");
if (playerOneInt == 2 && playerTwoInt == 2) System.out.println(playerOne + "  " + playerTwo + " Draw");

}
}
