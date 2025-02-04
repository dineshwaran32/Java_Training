package Day3;

class Employee1 {
	
	int empid;
	String name;
	float sal;

	public Employee1() {
		System.out.println("default constructor");
	}

	public Employee1(int empid, String name)	{
		this.empid = empid;
		this.name = name;
	}


}

class Developer1 extends Employee1 {
	
	public Developer1(int id, String name)	{
		//this.empid = id;
		//this.name = name;
		super(id , name);
		System.out.println("developer obj is created");
	}
	
	void calpay()	{
		this.sal = this.sal + 1500;
	}


	
}
public class P2 {
	public static void main(String args[])
	{
		Employee1 emp1 = new Employee1(22039,"Dinesh");
		Developer1 dev = new Developer1(1639,"Dinesh");
		System.out.println(dev.empid); 
		/*
		 * Now output
		 			default constructor
					developer obj is created
					1639
		 			
		 *  we can access when the 
		 	this.empid = id;
		 	this.name = name;  in developer class
		 	
		 	when it was not present in developer class
		 	output will be
		 	
		 			default constructor
					developer obj is created
					0
					
			it was null
		 
		 *  To invoke this we can declare explicitly call the constructor by using
		 *  super(id , name);
		 *          
		 */
 		
 		
 		
 
	}

}

