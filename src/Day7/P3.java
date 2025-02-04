package Day7;
import java.util.*;
/*
 * 
 * 3  cursors in collectionsare
 		
 		- Enumerator 
 		   	->  We can create enumeration object by using elements method of vector class.
 		   	->  Enumeration specific methods 
 		   	 		1. public boolean hasMoreElements();
 		   	 		2. public object nextElement();
 
 		- Iterator
 		- List iterator
 */
public class P3 {
	public static void main(String[] args) {
		Vector v = new Vector();
		for(int i = 1;i<=10;i++) {
			v.addElement(i);
		}
		Enumeration variable = v.elements();
		while(variable.hasMoreElements()) {
			//System.out.println(variable.nextElement());
			Integer a = (Integer)variable.nextElement();
			if((a%2) ==0) {
				System.out.println(a);
			}
		}
		
	}

}
