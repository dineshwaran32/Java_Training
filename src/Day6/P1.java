package Day6;

class Second1 extends Thread {
	private String threadname;
	Second1(String th){
		threadname = th;
	}
	
	public void run() {
		for(int i = 0 ; i<=3 ;i++) {
			System.out.println("Thread name : "+this.threadname);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println("Error occurrred");
			}}
			
				System.out.println(threadname + " Finished.");
			
		
	}
}

public class P1 {
	public static void main(String[] args) {
		Second1 t1 =  new Second1("Thread1");
		Second1 t2 =  new Second1("Thread2");
		Second1 t3 =  new Second1("Thread3");
		
		t1.start();
		System.out.println("In main block "+ Thread.currentThread());
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	}
}
