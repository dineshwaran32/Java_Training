package Day1;

public class P2 {
	public static void main(String args[]) {
		int a =10;
		/*
		         a            <---- var name
		    -----------
		   |		   |     <---- memory
		   |	10 <---|---------- the value assigned
		    -----------
		 */
		
		
		char ch ='A';
		/*
		       ch            <---- var name
		    -----------
		   |		   |     <---- memory
		   |	A <---|---------- the value assigned
		    -----------
		    
		    
		    *the character was not actually stored as ch
		    * instead it will store as ASCII value of that particular character
		    * For example :
		    	ASCII value of 'A' = 65
		    	Binary value of 65 = 1000001
		    	
		    	-----------------
		    	|0|1|0|0|0|0|0|1|
		    	-----------------
		    	 1 2 3 4 5 6 7 8  <--- bits
		    	 
		    	 
		    	* char datatype defines the 1 byte
		    	* 1 byte = 8 bits
		    	* the character will be stored in it 
		    	 
		    	* when the new character 'B' was added there is no space
		    	* thats why the datatype defines how much memory space can allocate to the data
		    	
		    	  
		    	  
		    	* Datatype will tell you how much emory spaceto be alloacted by a particular data 
		 */
		
		
		
		
		
		
		String name = "Raja";
		int age = 45;
		// IDENTIFIER
		/* Anything that identifies called as identifier
		 it was not only name , it also classname ,method name , etc .. which is used to identify 
		 */
		
		/*
		 *  = --> Assign operator
		 */
		
		
		short num1 ;
		int num2;
		long num3;
		/*
		 * For example
		 		int a =100000000;
		 		it consumes huge binary number
		 		due to this now a become not efficient to store the data
		 		to store this use long
		 		
		 		if the number is small --> use short
		 		if the number is normal--> use int
		 		if the number is excessive --> use long 
		  * the change of number is called modifier
		 */
		
		System.out.println(Integer.SIZE);  //32
		System.out.println(Float.SIZE);   //32
		System.out.println(Byte.SIZE);  //8
		
		/*
		 * Integer , Float , Byte --> called --> wrapper class
		 * When we need the size of data  we can use wrapper class and the Size was called
		 */
		
		
		System.out.println(Integer.MAX_VALUE); // 2147483647
		System.out.println(Integer.MIN_VALUE);  //-2147483648
		
		System.out.println(Float.MAX_VALUE);   //3.4028235E38
		System.out.println(Float.MIN_VALUE);   //1.4E-45
		
		System.out.println(Byte.MAX_VALUE);   //127			
		System.out.println(Byte.MIN_VALUE);   //-128
		
		/*
		 the max value can be determined using 2 ^ Integer.SIZE
		 ==> 2^8
		 
		 */
		
		
		
		
		//TYPE CONVERSION (say TYPE CASTING)
		/*
		   				  -> Implicit conversion
		 				 / 
		 				/
		 		2 TYPES 
		 				\ 
		 				 \
		 				  -> Explicit conversion
		 
		 */
		
		//IMPLICIT CONVERSION
		int ch1 = 'a';
		System.out.println(ch1); 	//97
		
		/*
		 * Here java itself converting the char datatype to int datatype
		 * called as implicit conversion
		 */
		
		float b1 = (float)ch1;
		System.out.println(b1);   //97.0
		
		/*
		 * Here we manual converting the int datatype to float datatype 
		 * called as implicit conversion
		 */
		
		
		int x =130;
		byte y = (byte)x;
		System.out.println(y);  //-126
		
		/*
		 * Here the byte ranges from -128 to 127 
		   but the actual value was 130 which was out of the holdable value
		   
		   
		   Since 130 is out of byte range (-128 to 127) we will have to rotate the scale to accomodate the conversion
		   
		   -128 , -127 , -126 , -125 , -124 , ...... , 127    --
		   														\
		   128  ,  129 ,  130	     							 \
		   ^													 /
		   ------------------------------------------------------
		   
		   thats why the output was -126
		   
		   
		   the conversion 
		     -----    1,2,3,4,5
		    |0|1|2|   	 when 3
		     -----    	 3%3 = 0
		     1 2 3	  	 the next value will store at 0 index  
		     4 			 hence 1 was replaced by 4
		     
		    now actual data
		    130%256 ==> 130
		     			/
		       ---------
		      /
		    130-256 ==> -126   //value will store at -126
		    
		     
		     Everytime the conversion takes place there was a dataloss ??
		     Answer : No there is no dataloss untill higher data was tried to convert 
		     
		     
		     
 	        *Data conversion happens without data loss when we are converting from Lower data to higher data

	        * Data loss may occur when you are converting a higher data to lower data 
	  		when the higher data is out of range from the lower data
	
		 */
		
		
		
		//PARSING
		
		int pvalue = Integer.parseInt("10");
		System.out.println(pvalue);  //10
		
		/* Here the  string will be parsed to integer data
		   but vice versa cannot able to done 
		   instead 
		*/
		String pval1 = String.valueOf(10);
		System.out.println(pval1);  //10

		
	}
}
