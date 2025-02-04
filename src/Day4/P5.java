package Day4;
import java.util.*;
class Stock{
	static int stockvalue = 5;
	static void updatestock(int order) {
		try {
			if(stockvalue<5) {
				throw new ArithmeticException();
			}
		}catch(ArithmeticException e) {
			System.out.println("Please restock the inventory order not processed");
		}finally {
			System.out.println("Finished");
		}
		if(order>stockvalue){
			System.out.println("OUT OF STOCK");
		}
		
	}
}
public class P5 {
	public static void main(String args[]) {
		Scanner s = new Scanner (System.in);
		System.out.print("Enter order : ");
		int order  = s.nextInt();
		System.out.println();
		Stock s1 = new Stock();
		s1.updatestock(order);
		
	}

}
