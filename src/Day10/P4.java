package Day10;


interface Add{
	int sum(int a , int b);
	
}
public class P4 {
	public static void main(String[] args) {
		/*
		 * An uinterface with onlu one abstract method is called functional interface
		 * we dont worry about existence of default or static method
		 */
		
		Add addnumbers =(a,b) -> a-	b;
		
		System.out.println(addnumbers.sum(5,10));
	}
}
