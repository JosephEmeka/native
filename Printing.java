import java.util.Scanner;

public class Printing{

public static void main (String[] args) {

Scanner input = new Scanner(System.in);

int x = 5;
int y = 1;

System.out.printf("x = %d%n", x + 5); 
System.out.printf("Value of %d * %d is %d\n", x, y, (x * y) ); 
System.out.printf("x is %d and y is %d", x, y);
System.out.printf("%d is not equal to %d\n", (x + y), (x * y) );

int p = 5; 
System.out.printf("%d", p + 2 * 4); 
System.out.printf("%d", p * 2 + 4); 

System.out.printf("  ****%n ******%n*******%n ******%n  ****%n"); 

System.out.println("*"); 

System.out.println("***"); 

System.out.println("*****"); 

System.out.println("****"); 

System.out.println("**"); 

System.out.print("*"); 

System.out.print("***"); 

System.out.print("*****"); 

System.out.print("****"); 

System.out.println("**");

System.out.print("*"); 

System.out.println("***"); 

System.out.println("*****"); 

System.out.print("****"); 

System.out.println("**"); 

System.out.printf("%s%n%s%n%s%n%s%n", "  *", " ***", "*****", " ***", "  *");


}
}