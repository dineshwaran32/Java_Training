package Day7;

import java.util.*;
public class P6 {
	public static void main(String[] args) {
		PriorityQueue p1 = new PriorityQueue();
		for(int i=1;i<=10;i++) {
			p1.offer(i);
		}
		System.out.println(p1);   //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		System.out.println(p1.poll());  //1
	}

}
