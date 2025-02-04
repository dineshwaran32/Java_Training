package Day12;

import java.util.Arrays;

enum Traffic{
	RED,GREEN,YELLOW	
}

public class P2 {
	public static void main(String[] args) {
		/*
		 * Enum is a special data type in java to represent a fixed constant , enum in java are essentially special type of class
		 * static final instance of a enum
		 * enum variable_name{
		 			const1 , const2;
		 			}
		 * every enum 
		 */
	
		   System.out.println(Traffic.RED.ordinal()); 	// PRINT ZERO
		  // System.out.println(Traffic.BLUE.ordinal()); //ILLIGAL ACCESS 
		   Traffic c = Traffic.RED;
		   System.out.println(Traffic.RED);
		  // String str = Traffic.GREEN; // error 
		   Traffic t[] = Traffic.values();
		   System.out.println(Arrays.toString(t));
		   
		   for(Traffic val:Traffic.values())
		   {
			   System.out.println("value :" + val.ordinal());
		   }
		   
		}
		
	}

}
