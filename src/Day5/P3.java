package Day5;

class Second2 extends Thread{
	
	public void run() {
		
		System.out.println(Thread.currentThread());   
		
	}
}
public class P3 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread()); //Thread[#1,main,5,main]
		Second2 s2 = new Second2();
		s2.run();	//Thread[#1,main,5,main]
		/*
		 * When an object calls the run method by using the method name run then the run method is treated as a normal method
		 * if the run method has to be treated as an overrided method of the thread class then you have to use start method to call the run 
		  
		 * When calling s2.run the main class is responsible for running the class second run method since it is an normal function call 
		 * thus the output of current thread is still main
		 */
		s2.start(); //Thread[#21,Thread-0,5,main]  

		/*
		 * where as by calling the run method by start method creates new thread and thus a different name is printed 
		 *  To start a thread we need to call by using start()*/
		
		
		//s2.start(); 
		/*
		 * 	Exception in thread "main" java.lang.IllegalThreadStateException
			at java.base/java.lang.Thread.start(Thread.java:1512)
			at Javatraing039/Day5.P3.main(P3.java:26)
		 */
		//s2.run();
	}
}
