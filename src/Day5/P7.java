package Day5;
class Stock{

	 int num;
	 boolean status=false;
	 synchronized void set(int num) {
	  while (status) {
	       try {
	         wait();
	       } catch (InterruptedException e) {
	         System.out.println("InterruptedException in set");
	       }
	     }
	 this.num=num;
	 System.out.println("Set :"+num);
	 status=true;
	 notify();
	 }

	 synchronized void get() {
	  while (!status) {
	       try {
	         wait();
	       } catch (InterruptedException e) {
	         System.out.println("InterruptedException in set");
	       }
	     }
	 System.out.println("Get :"+num);
	 status=false;
	 notify();
	 }
	}

	class Producer implements Runnable{
	 Stock s;
	 int i=0;
	 Producer(Stock s){
	 this.s=s;
	 Thread th1=new Thread(this,"Producer");
	 th1.start();
	 }

	 @Override

	 public void run() {
	 int i=0;
	 while(true) {
	  s.set(i++);
	  try {
	  Thread.sleep(1000);
	  } catch (InterruptedException e) {
	  System.out.println("InterruptedException");
	  }
	 }
	 }
	}

	class Consumer implements Runnable{
	 Stock s;
	 Consumer(Stock s){
	 this.s=s;
	 Thread th2=new Thread(this,"consumer");
	 th2.start();

	 }

	 @Override
	 public void run() {
	 while(true) {
	  s.get();
	  try {
	  Thread.sleep(1000);
	  } catch (InterruptedException e) {
	  System.out.println("InterruptedException");
	  }
	 }
	 }
	}

	public class P7 {
	  public static void main(String[] args) {
	 Stock s=new Stock();
	 new Producer(s);
	 new Consumer(s);
	 
	 
	
	 }
	}

	
	
	