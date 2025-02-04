package Day3;

class Employeee {
	int empid;
	String name;
	float sal;

	public Employeee() {
		System.out.println("default constructor");
	}

	public Employeee(int empid, String name, float sal)	{
		this.empid = empid;
		this.name = name;
		this.sal = sal;
	}

	void display()	{
		System.out.println(empid);
		System.out.println(name);
		System.out.println(sal);
	}
	void fun() {
		System.out.println("This is from fun");
	}
	
	void fun(int a) {
		System.out.println("Same method with arg "+ a);
	}

}

class Developer extends Employeee {
	public Developer()	{
		System.out.println("developer obj is created");
	}

	void calpay()	{
		this.sal = this.sal + 1500;
	}

}
public class P1 {
	public static void main(String args[])
	{
		Developer dev = new Developer();
		dev.sal = 10000;
		dev.calpay();
 		System.out.println(dev.sal);
 		
 		/*
 		 * The above code when the object is created the object first execute the default constructor in the parent class and then execute 
 		 * the child class constructor . however when the method is called from the same object of the developer class the associated method from its own class(developer) is executed
 		*/
 		
 		
 		dev.fun(); // this called by second class but present in the parent class
 		/*
 		 * The execution order of dev.fun(); code is method resolution order
 		 * child class --> parent class
 		 * it is a pathway to determine which method is to be executed when a method call is made
 		 */
 		
 		dev.fun(5);  // overloading funtion
 		/*
 		 * Same method but arguments will differ called as method overloading
 		 */
 		
 		
 		
 		/*CONDITIONS FOR OVERLOADING
 		 * 
 		 * Atleast two methods with the same name should be defined within the same class.
 		 * Those methods should either 1. differ in argument length.
 		  							   2. differ in argument datatype.
 		 */
 		
 		
 		
 		/*CONDITIONS FOR OVERRIDING
 		 *
 		 * Minimum 2 classes must be there for overriding.
 		 * Class involved should exibit inhertance.
 		 * The child class should have atleast one method with implementation , the method should have same signature as the parent class method.
 		 */
	}

}

