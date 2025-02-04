package Day5;

public class P1 {
	public static void main(String args[]) {
		System.out.println(Thread.currentThread()); // Thread[#1,main,5,main]
		
		/*
		 * We can tell that at the point of time atleast one thread will run
		 * and that 1 thread played by the main class
		 */
		System.out.println(Thread.currentThread().getName()); //main
		// It tells the name of the current thread
		
		//THREAD PROPERTIES
		System.out.println(Thread.currentThread().getPriority());   //5 because normal/default value 
		
		Thread.currentThread().setName("Dinesh");   // set the name of the thread
		System.out.println(Thread.currentThread().getName()); // Dinesh
		Thread.currentThread().setPriority(3);      // set the priority
		System.out.println(Thread.currentThread().getPriority()); //3
		Thread.currentThread().setPriority(0); 
		
	}

}
