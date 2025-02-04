package Day5;
/*
 * Implement thread using ruunable interface   
 */
class Second3 implements Runnable {
	public void run() {
		for(int i = 0 ;i<5;i++) {
			System.out.println(Thread.currentThread());
			Thread.yield();
			System.out.println();
			
		}
		
	}
}

public class P4 {
	public static void main(String[] args) {
		Second3 s = new Second3();
		Thread th = new Thread(s); //Thread[#21,Thread-0,5,main]
		th.start();
		th.setPriority(10);
		Second3 s1 = new Second3();
		Thread th2 = new Thread(s1,"Pookie"); //Thread[#22,Pookie,5,main]
		th2.start();
		
		
		/*
		 * If a normal state of thread is interuppeted by any means throws an interupptedexception
		 * Hence we have to pause a running state thread it is recommended to handle 
		 */
	}

}
