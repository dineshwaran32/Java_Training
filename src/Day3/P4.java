package Day3;

abstract class Employe

{
	int id;
	String name;
	String roll;
	double sal;

	public Employe(int id, String name, String roll, double sal) {
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
	
	abstract void calculate() ;
}

class Dev extends Employe {

	public Dev(int id, String name, String roll, double sal) {
		super(id, name, roll, sal);

	}
	void calculate() {
		this.sal = 100000;
	}


}

class HR extends Employe {
	public HR(int id, String name, String roll, double sal) {
		super(id, name, roll, sal);

	}
	void calculate() {
		this.sal = 1000000;
	}

}

class Accountanat extends Employe {
	public Accountanat(int id, String name, String roll, double sal) {
		super(id, name, roll, sal);

	}
	void calculate() {
		this.sal = 10000000;
	}


}

public class P4 {
	public static void main(String args[]) {
		Dev emp1 = new Dev(101,"dinesh","Developer",10000);
		Accountanat emp2 = new Accountanat(101,"dinesh","Accountant",10000);
		HR emp3 = new HR(101,"dinesh","HR",10000);
		emp1.calpay();
		emp2.calpay();
		emp3.calpay();
		emp1.calculate();
		emp2.calculate();
		emp3.calculate();
		emp1.display();
		emp2.display();
		emp3.display();
		

	}

}


/*
 * The above program Abstract employee holds all the common methods that can be used by all its child classes 
 * However that seems to be no need of creating an object for the employee class itself. 
 * 
 * The abstract methoad callpay defined in abstract class employee must be implemented in all the child classes.
*/