package Day5;
class Second1{
	void loop() {
		System.out.println("Second fun block");
		System.out.println(Thread.currentThread().getName());
		/*
		 * 	Second fun block
			main
		 */
	}
}
public class P2 {
	public static void main(String[] args) {
		for(int i=1 ; i<=5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
		/*
			main
			main
			main
			main
			main
		*/
		
		Second1 s1 = new Second1();
		s1.loop();
		/*
		 * The main thread is responsible for running the entire code by default
		 */
		
		/*
		 * Thread can be created in: 
		 * Two ways  - implement thread
		 * Class - extend using thread class
		 * Class - implements using Runnable interface  
		 */
		
	}

}
