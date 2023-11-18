import java.util.Scanner;

public class Compare{

public static void main(String[] args){

Scanner userInput = new Scanner(System.in);

System.out.println("Enter Integer: ");

int oneInteger = userInput.nextInt();

int square = oneInteger * oneInteger;

if (oneInteger + square > 100) {
 System.out.println("number and its square are greater than 100"); 
}

else if (oneInteger + square == 100){
System.out.println("number and its square equal to 100");

} 

else if (oneInteger + square != 100){
System.out.println("number and its square is not equal to 100");
}

else {
System.out.println("number and its square is less than 100");

}




}

}