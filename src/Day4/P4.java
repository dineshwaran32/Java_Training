package Day4;
import java.util.*;
class MyException extends Exception{
	MyException(String msg){
		super(msg);
	}
}

class Second2 {

	int arr[] = { 1, 45, 23, 4 };

	void firstcall() {
		secondcall1();
		System.out.println();
	}

	void  secondcall1() {
		int c;
		Scanner s = new Scanner(System.in);
		System.out.println("second call block");
		try {
			int b = 5 / 6;
			throw new MyException("Custom Exception");
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("error");
		}
		

	}

}
/*
 * An exception can also be user defined 
 */

public class P4 {
	public static void main(String[] args) {
		Second2 s2 = new Second2();
		s2.firstcall();
	}

}
