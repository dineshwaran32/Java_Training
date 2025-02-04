package Day10;

interface Second {
	
	abstract void run();
	default void run2() {
		System.out.println("Default method");
	}
}

class Third implements Second {
	public void run() {
	}
}

public class P2 {
	public static void main(String[] args) {
		Second s = new Second() {
			public void run() {
				System.out.println("Eunning abstract method");
			}
		};
		s.run();
		s.run2();
	}
}
/*

the default method or abtract method cannot be executed since the interface cannot be instantiated
only the static method runs because a static method in interface can be called by using the interface name itself 

*/