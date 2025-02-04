package Day7;

import java.util.Comparator;

import java.util.PriorityQueue;

class MyComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = (String) o2;
		return s2.compareTo(s1);
	}
}

public class P7 {
	public static void main(String[] args) {
		PriorityQueue pq1 = new PriorityQueue(new MyComparator());
		pq1.offer("B");
		pq1.offer("A");
		pq1.offer("D");
		System.out.println(pq1);
		System.out.println(pq1.poll());
	}
}
