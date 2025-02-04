package Day4;

class Second{
	void firstcall() {
		secondcall();
	}
	void secondcall() {
		System.out.println("Second call block");
		int b = 5/0;
	}
}
public class P2 {
	public static void main(String[] args) {
		Second s = new Second();
		s.firstcall();
	}
}

/*
 * 	Second call block
	Exception in thread "main" java.lang.ArithmeticException: / by zero
		at Javatraing039/Day4.Second.secondcall(P2.java:9)
		at Javatraing039/Day4.Second.firstcall(P2.java:5)
		at Javatraing039/Day4.P2.main(P2.java:15)
		
	The exception works like the stack data structure 
	
	|--------------|
	|  second call |
	|--------------|
	|  first call  |
	|--------------|
	|  main method |
	|--------------|
	| java         |
	|--------------|
	
	
	* when the error is caughted it is immedietly reported to the immediate higher body that is the current activation record in the stack trace.
	* if the current activation recored is not capable of handling the error it reports to the next higher level body in the hierarchy.
	* when none of the higher body are able to resolve the exception they report to the main method which will pass it to JVM to take action
	* 
	
	
*/
