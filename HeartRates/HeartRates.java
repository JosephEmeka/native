 public class HeartRates{

	private String firstName;
	private String lastName; 
	private double year;
	private double month; 	
	private double day; 

public HeartRates (String firstName, String lastName, int year, int month,int day) {

		this.firstName = firstName;
		this.lastName  = lastName;
		this.year      = year;
		this.month     = month;
		this.day       = day;
		
		}

	public void setFirstName(String firstName){

		this.firstName = firstName;

	}


	public String getFirstName(){

		return firstName;

	}


	
	public void setLastName(String lastName){

		this.lastName = lastName;

	}


	public String getLastName(){

		return lastName;

	}


	public void setYear(double year){

		this.year = year;

	}


	public double getYear(){

		return year;

	}


	public void setMonth(double month){

		this.month = month;

	}


	public double getMonth(){

		return month;

	}


	public void setDay(double day){

		this.day = day;	

	}


	public double getDay(){

		return day;

	}



	public double getAge(){

        return 2023 - year;


}


	public double findMaximumHeartRate(){

	return 220 - getAge();

}



	public String TargetHeartRate(){
	
	double maxHeartRate = findMaximumHeartRate();
        double lowerRange =  (maxHeartRate * 0.5);
        double upperRange =  (maxHeartRate * 0.85);
        return lowerRange + " - " + upperRange;
	
		



}





}