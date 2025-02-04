package Day5;


class Trainer {
	synchronized void tt(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * " + n + "= " + (i * n));
		}}}

class ECE extends Thread {
	Trainer sakthi;
	public ECE(Trainer sakthi) {
		this.sakthi = sakthi;
	}
	public void run() {
		this.sakthi.tt(5);
	}
}

class CSE extends Thread {
	Trainer sakthi;
	CSE(Trainer sathi) {
		this.sakthi = sathi;
	}
	public void run() {
		this.sakthi.tt(7);
	}
}

public class P5 {
	public static void main(String[] args) {
		Trainer sakthi = new Trainer();
		CSE cse = new CSE(sakthi);
		ECE ece = new ECE(sakthi);
		cse.start();
		ece.start();

	}

}

/*
 * synchronized is used for only one thread can access the method untill the thread finishes
 * Sychro method at thread safe method that os used to manage the access of a shared resource without thread swithing 
 * the above code the mthod printable is a common method bot the thread of CSE and ECE hence the printable method should be synchronized to avoid thread swapping
 */
/*
 * output without synchronized
 	1 * 5= 5
	2 * 5= 10
	3 * 5= 15
	4 * 5= 20
	5 * 5= 25
	6 * 5= 30
	7 * 5= 35
	8 * 5= 40
	1 * 7= 7
	2 * 7= 14
	3 * 7= 21
	4 * 7= 28
	5 * 7= 35
	6 * 7= 42
	7 * 7= 49
	8 * 7= 56
	9 * 7= 63
	10 * 7= 70
	9 * 5= 45
	10 * 5= 50
*/


/*
 * 	output with synchronized 
  	1 * 7= 7
	2 * 7= 14
	3 * 7= 21
	4 * 7= 28
	5 * 7= 35
	6 * 7= 42
	7 * 7= 49
	8 * 7= 56
	9 * 7= 63
	10 * 7= 70
	1 * 5= 5
	2 * 5= 10
	3 * 5= 15
	4 * 5= 20
	5 * 5= 25
	6 * 5= 30
	7 * 5= 35
	8 * 5= 40
	9 * 5= 45
	10 * 5= 50
*/