package Day5;

class Stock1
{
	int num;
	void set(int num) {
		System.out.println("Set : "+num);
		this.num = num;
	}
	synchronized void get() {
		System.out.println("Get : "+num);
	}
}


class Producer1 implements Runnable{
	Stock1 s;
	int i =0;
	Producer1(Stock1 s ){
		this.s = s;
		Thread t1 = new Thread(this,"Producer");
		t1.start();
	}
	@Override
	public void run() {
		
		int i = 0;
		while(true) {
			s.set(i++);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

class Consumer1 implements Runnable {
	Stock1 s;
	Consumer1(Stock1 s ){
		this.s = s;
		Thread t2 = new Thread(this , "Consumer");
		t2.start();
	}
	@Override
	public void run() {
		while(true) {
			s.get();
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		
	}
	
}
public class P6 {
	public static void main(String[] args) {
		Stock1 s = new Stock1();
		Producer1 p1 = new Producer1(s);
		Consumer1 c1 = new Consumer1(s);
	}
}

/*
 * The above code the producer and consumer are not in sinks does either the producer 
 * The producer keeps on producing or puts the consumer in starvation
 * 
*/
