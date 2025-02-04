package Day12;

import java.util.*;
class Order
{
	int id;
	int value;
	Order(int id , int val){
		this.id = id;
		this.value = val;
	}
	
}
public class task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = s.nextInt();
        int m = 2;
        Order[] arr = new Order[n];
        int o , v;
        System.out.println("Enter " + n );
        for (int i = 0; i < n; i++) {
        	System.out.println("Enter order " );
                o = s.nextInt();
            System.out.println("Enter value ");
                v = s.nextInt();
                arr[i]= new Order(o ,v);
           
        	
        }
        
        
       
       
       Arrays.sort(arr,(o1,o2) -> Integer.compare(o1.value , o2.value));
       
       System.out.println("Enter key : ");
       int key = s.nextInt();
       for (int i = n-key; i < n; i++) {
           System.out.println(arr[i].id +" " +arr[i].value);
       }

       
    }
}
