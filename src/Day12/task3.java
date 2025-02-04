package Day12;
import java.util.*;
class Order1
{
	int id;
	int value;
	Order1(int id , int val){
		this.id = id;
		this.value = val;
	}
	
}
public class task3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = s.nextInt();
        int m = 2;
        Order1[] arr = new Order1[n];
        int o , v;
        System.out.println("Enter " + n );
        for (int i = 0; i < n; i++) {
        	System.out.println("Enter order " );
                o = s.nextInt();
            System.out.println("Enter value ");
                v = s.nextInt();
                arr[i]= new Order1(o ,v);
           
        	
        }
        
        int k = 2;
        PriorityQueue<Order1> pq = new PriorityQueue<>(k , Comparator.comparingInt(obj -> obj.value));
        
        for(Order1 i : arr) {
        	pq.offer(i);
        	if(pq.size() >k) {
        		pq.poll();
        	}
        }
        
        while(!pq.isEmpty()) {
        	Order1 a = pq.poll();
        	System.out.println("Id : "+a.id + " value : "+ a.value);
        }
        
        
	}

}
