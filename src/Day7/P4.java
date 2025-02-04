package Day7;

import java.util.*;

public class P4 {
	
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		for(int i = 1 ; i<=10;i++) {
			a1.add(i);
		}
		ListIterator lst = a1.listIterator();
		while(lst.hasNext()) {
			// System.out.print(lst.next()+ " ");  //1 2 3 4 5 6 7 8 9 10 
			Integer i = (Integer) lst.next();
			if(i == 2) {
				lst.remove();
			}
			else if(i==5) {
				lst.set(25);
			}
			else if(i==7) {
				lst.add(77);
			}
		}
		System.out.println(a1);  //[1, 3, 4, 25, 6, 7, 77, 8, 9, 10]
	}
}
