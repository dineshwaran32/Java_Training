package Day11;

//LAMBDA with multiple  lines

interface fn{
	abstract void cal(int a , int b);
}
public class P2 {
	public static void main(String[] args) {
		fn var = (a,b)-> {
			System.out.println(a+b);
			System.out.println(a*b);
		};
		
		var.cal(5,10);   //15,50
	}
}
