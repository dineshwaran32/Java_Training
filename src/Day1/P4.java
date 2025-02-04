package Day1;

public class P4 {
	public static void main(String[] args) {
		//Elimination statement
		//if statement
		if(true){		}
		else {    }
		
		
		//switch statement
		switch(1) {
		case 1:
			break;
		default :
			break;
		}
		
		
		
		//LOOPING statement
		int i =2;
		
		//while loop
		while(i<5) {
			i =i+1;
		}
		
		//do_while loop
		do {
			i = i+1;
		}while(i<6);
		
		
		//for loop
		for(i=2;i<=3;i++) {
			
		}
	}
	
	//RECURSION FUNCTION
	int rec(int i) {
		if( i==1)
		{
		 return 1;
		}
		else {
			return i + rec(i-1);
		}
	}
}
