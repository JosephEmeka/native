import java.util.Scanner;

public class Factor{

public static void main (String[]arg){

System.out.println("Enter preferred number: ");

Scanner input = new Scanner(System.in);

int number = input.nextInt();

for (int i = 1; i <= number; i = ++i ) {

    if (number % i == 0) {

       System.out.println(i);

         }
  

}



}


}