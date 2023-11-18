import java.util.Scanner;

public class DaysInAMonth {

public static void main (String[] args) {

Scanner input = new Scanner (System.in);

System.out.println("Enter preferred Month between 1-12: ");

int Month = input.nextInt();

System.out.println("Enter preferred Year: ");

int Year = input.nextInt();

if (Month == 1) System.out.println ("January" + Year + " had 31 days");
if (Month == 2) System.out.println ("February" + Year + " had 29 days");
if (Month == 3) System.out.println ("March" + Year + " had 31 days");
if (Month == 4) System.out.println ("April" + Year + " had 30 days");
if (Month == 5) System.out.println ("May" + Year + " had 31 days");
if (Month == 6) System.out.println ("June" + Year + " had 30 days");
if (Month == 7) System.out.println ("July" + Year + " had 31 days");
if (Month == 8) System.out.println ("August" + Year + " had 31 days");
if (Month == 9) System.out.println ("September" + Year + " had 30 days");
if (Month == 10) System.out.println ("October" + Year + " had 31 days");
if (Month == 11) System.out.println ("November" + Year + " had 30 days");
if (Month == 12) System.out.println ("December" + Year + " had 31 days");
if (Month > 12) System.out.println ("invalid");










}
}

