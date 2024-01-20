public class BarChart {


	public static void main(String...args){

	int [] scores = {2, 4, 5, 17, 22, 11, 5, 7, 9, 1, 8};

		System.out.println();

		System.out.println ("Grade distribution");


		for (int counter = 0; counter < scores.length; counter++){

			if (counter == 10){

				System.out.printf("%5d: ", 100);

			}


			else{

				System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);

			}
				

				for (int stars = 0; stars < scores[counter]; stars++){


					System.out.printf("*");

				}
			
			System.out.println();

		}



	}


}