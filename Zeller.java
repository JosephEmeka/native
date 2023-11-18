import java.util.Scanner;

public class Zeller{

public static void main(String [] args) {

Scanner input = new Scanner(System.in);


System.out.println("Enter Year(e.g., 2012): ");

int y = input.nextInt();



System.out.println("Enter month between 1-12: ");

int m = input.nextInt();



System.out.println("Enter day of the month between: 1-31: ");

int q = input.nextInt();


if (m == 1)  {m = 13;}
if (m == 2)  {m = 14;}
if (m == 3)  {m = 3;}
if (m == 4)  {m = 4;}
if (m == 5)  {m = 5;}
if (m == 6)  {m = 6;}
if (m == 7)  {m = 7;}
if (m == 8)  {m = 8;}
if (m == 9)  {m = 9;}
if (m == 10) {m = 10;}
if (m == 11) {m = 11;}
if (m == 12) {m = 12;}
            
int j = y / 100;

int k = y % 100;

int h =  (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j);

h = h %7;

if (h == 0) System.out.println("Day of the week is Saturday");
if (h == 1) System.out.println("Day of the week is Sunday");
if (h == 2) System.out.println("Day of the week is Monday");
if (h == 3) System.out.println("Day of the week is Tuesday");
if (h == 4) System.out.println("Day of the week is Wednesday");
if (h == 5) System.out.println("Day of the week is Thursday");
if (h == 6) System.out.println("Day of the week is Friday");



}
}








