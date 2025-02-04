package Day3;

interface Payment{
	int a = 10;
	default void fun() {
		System.out.println("This is interface fun");
	}
	
	static void test1() {
		System.out.println("This is static test");
	}
}
abstract class Employe1

{
	int id;
	String name;
	String roll;
	double sal;

	public Employe1(int id, String name, String roll, double sal) {
		this.id = id;
		this.name = name;
		this.roll = roll;
		this.sal = sal;
	}
	
	void display() {
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.roll);
		System.out.println(this.sal);
		System.out.println("****");
	}
	
	void calpay() {
		this.sal = this.sal + (this.sal *0.05);
	}
	
	
	
}

class Dev1 extends Employe1 implements Payment{

	public Dev1(int id, String name, String roll, double sal) {
		super(id, name, roll, sal);

	}
	void calculate() {
		this.sal = 100000;
	}


}

class HR1 extends Employe1 implements Payment{
	public HR1(int id, String name, String roll, double sal) {
		super(id, name, roll, sal);

	}
	void calculate() {
		this.sal = 1000000;
	}

}

class Accountanat1 extends Employe1 implements Payment {
	public Accountanat1(int id, String name, String roll, double sal) {
		super(id, name, roll, sal);

	}
	void calculate() {
		this.sal = 10000000;
	}


}

public class P5 {
	public static void main(String args[]) {
		Dev1 emp1 = new Dev1(101,"dinesh","Developer",10000);
		Accountanat1 emp2 = new Accountanat1(101,"dinesh","Accountant",10000);
		HR1 emp3 = new HR1(101,"dinesh","HR",10000);
		Payment.test1();
		
		
		

	}

}


/*
 * Any cpncrete method in  an interface should always be defined with 
 
 
 * INTERFACE
 * 
 * A interface can extend another interface 
 * A class can implement any number of interface
 * Every variable in interface is default static final 
 * All the concrete methods in the interface should be default
 * All static methods of interface are accessible only by the interface name and not the inherited class name
 * 
*/