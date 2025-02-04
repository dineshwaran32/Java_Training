package Day2;

class Car
{
	
	String name;
	int milege;
	String color; 
	
	Car(String name, int m , String c){
		this.name= name;
		milege = m;
		color = c;
	}
	
	/*
	 Car(String n, int m , String c){	} --> is a constuctor
	 this.name= name;  --> this is a keyword which is used to denote the name variable in the class
	 milege = m;       --> here no need this keyword because both the variable are different	 
	 */
	void display() {
		System.out.println("Car name = " + name );
		System.out.println("Car Milege = " + milege);
		System.out.println("Car color = " + color);
		System.out.println("**********************");
	}
}

public class P1 {
	public static void main(String args[])
	{
		Car c1 = new Car("Rolls-royce" , 15 , "Gold");
		Car c2 = new Car("Audi" , 23 , "Black");
		c1.display();
		/*
		 Car name = Rolls-royce
  		 Car Milege = 15
		 Car color = Gold
		 **********************
		 */
		c2.display();
		/*
		 Car name = Audi
		 Car Milege = 23
		 Car color = Black
		 **********************
		 */
	}

}
