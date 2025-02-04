package Day12;

import java.util.*;

enum Operation{
	Add{
		public int apply(int x ,int y) {
			return x+y;
		}
	},
	
	Subtract{
		public int apply(int x , int y) {
			return x -y;
		}
	};
	
	public abstract int apply(int x , int y);
}
public class P5 {
	public static void main(String[] args) {
		System.out.println(Operation.Add.apply(5,10));
		System.out.println(Operation.Subtract.apply(5, 10));
	}

}
