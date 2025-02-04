package Day1;

//for different type of data
class Bike
{
	
	String name;
	int milege;
	String color; 
}


public class P3 {
	public static void main(String[] args) {
		int arr1[] = {10,20,30};
		// the arr1 was used for similar data 		
		// suppose in a company there will be many employee all of them has name , id and salary different data
		/*
		  class Bike
			{
	
				String name;
				int milege;
				String color;
			}

		 
		 to execute it
		 */
		
		Bike b1 = new Bike();
		
		/*
		 * Here Employee emp1 = new Employee();
		 	Bike  --> Classname
		 	b1      --> instance
		 	new       --> allocates just a space
		 	Bike()--> it tells how many space needs to allocate 
		 	"Ninja-H2r",14,"Blue" --> the value pass to the constructor
		 	
		 	this is how the class instance will be declared
		 	now there is no data stored instead memory only allocated		 	
		 */
		
		//To access/store the data in employee
		b1.name = "Ninja";
		b1.milege = 14;
		b1.color = "Blue";		
		/*
		 * emp1   --> is the instance
		 * dot(.) --> operator used to  access the variables present in the class
		 */
	}
}
