package Day11;
//Parallel Stream 

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * Parallel stream works processing the parallel 
 */

/*
 * filter(Predicate ) -> filters elements based on condition 
 * sorted() -> sorts element 
 * collect(collectors) -> collects results into the result ,set, etc..
 * foreach(consumer) -> iterates over each element
 */
public class P5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		List<String> nn = Arrays.asList("Dinesh","Butter", "Mukesh","Grandma");
		
		System.out.println("Processing sequential stream");
		
		nn.parallelStream().forEach(i->System.out.println(i));
		
		
		
		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8);
		num.stream().filter(i-> i%2==0).forEach(i->System.out.println(i));  //2468

		/*
		 * the code displays nothingbecause theree is no terminal operation
		 * Terminal operation that produce result 
		 * 1. collect
		 * 2. foreach 
		 * 3. reduce
		 */
		
		 
		System.out.println("Enter the numbers");
		  String str = s.nextLine();
		  String arr[] = str.split(" ");
		  int ar[]= new int[arr.length];
		  for(int i=0;i<arr.length;i++)
		  {
		 ar[i]=Integer.parseInt(arr[i]);
		  }
		  for(int i=0;i<ar.length;i++)
		  {
		  System.out.println(ar[i]);

		  }
	}

}
