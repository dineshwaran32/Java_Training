package Day4;

public class P1 {
	public static void main(String args[]) {
		int a;
		System.out.println("Before error");
		//int b = a/0;
		
		/*
		 * 
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			The local variable a may not have been initialized
		
			at Javatraing039/Day4.P1.main(P1.java:7)
			
			
		 * In the above code catches non initialized error during the compile time and that can be handled by experts and then deploy it
		 * However they are instance when error occurs during the run time 
		 */
		
		
		a =10;
		
		/*
		 * Before error
			Exception in thread "main" java.lang.ArithmeticException: / by zero
				at Javatraing039/Day4.P1.main(P1.java:7)
	
		 * The above code arithmetic exception only during the run time not compile time
		 * These kind of errors handled by the progammer using exception handling mechanism
		 */

		try {
			 int b =a/0;
			 System.out.println("Hello");
		}catch(ArithmeticException e) {
			System.out.println("Error : Occured");
		}catch(Exception e) {
			System.out.println("error");
		}

		System.out.println("After error");
		/*
		 * The above code since the run time exception is handled using try block
		 * the lines after the run time exception also runs file without breaking the code
		 
		 *  Before error
			Error : Occured
			After error
		 */
		
	}
}


/*
 * Exception handling are used to avoid code break due to some runtime exception that is occurred in the previous code statement
 * Exception handling also helps us to configure custom message such that we give meaningful error message and also next code of action
 * 
 */
