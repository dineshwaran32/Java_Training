package Day11;


interface Add{
	int sum(int a , int b);
	
}
public class P1 {
	public static void main(String[] args) {
		Add addnumbers =(a,b) -> a+b;
		Add multiple = (a,b) -> a*b;
		
		System.out.println(addnumbers.sum(5,10));
		System.out.println(multiple.sum(2, 5));
	}

}


/*
 * Usually when an abstract method in an interface has to implement two different behaviour we have to create two different classes 
 * that implements the interface and override the method in each classes with different behaviour
 * 
 * the implementation behaviour can be obtained by creating the decide class object
 *  
 * but when using an interface that has the astract method implementation that using lambda methods can simply cut-down the work of 
 * creating two implementation class and also objects coresonding to the class
 * 
 */
