package Day3;

//Method Overloading

class Employee

{

	int empid;
	String name;
	float sal;
	String company = "ZOHO";

	public Employee() {
		System.out.println("Employee default constructor");
	}

	public Employee(int empid, String name, float sal)
	{

		this.empid = empid;
		this.name = name;
		this.sal = sal;
		System.out.println("Empoyee para constructor");
	}

	void display() {

		System.out.println(empid);
		System.out.println(name);
		System.out.println(sal);

	}

}

class Developer2 extends Employee {

	String lang;
	String designation = "Developer" + super.company;
	public Developer2(int empid, String name, float sal, String lang)

	{

		super(empid, name, sal);
		this.lang = lang;
		System.out.println("Developer para constructor");

	}

	void calpay()

	{
		this.sal = this.sal + 1500;
	}

	void display() {

		super.display();
		System.out.println(lang);
		System.out.println(designation);
	}

}

public class P3 {

	public static void main(String args[])

	{

		Employee emp = new Employee(101, "Dinesh", 12000.0f);
		Developer2 dev = new Developer2(101, "Dinesh", 12000.0f, "java");
		System.out.println(dev.name);
		emp.display();
		dev.display();

	}

}

/*
 * 
 * The above code when the object is created the object first execute the
 * default constructor in the parent class and then execute
 * 
 * the child class constructor . however when the method is called from the same
 * object of the developer class the associated method from its own
 * class(developer) is executed
 * 
 */

/*
 * 
 * Overriding conditions
 *
 * 
 * 
 * 1.Minimum two classes needed.
 * 
 * 2.Classes involves should exhibit inheritance.
 * 
 * 3.The Child class should have atleast one method with implementation ,the
 * method should have the same signature as the parent class method
 * 
 */

/*
 * 
 * Overloading conditions:
 *
 * 
 * 
 * 1.Atleast Two methods with the same name should be defined within the same
 * class.
 * 
 * 2.Those methods should either have different length or argument type.
 *
 * 
 * 
 */
