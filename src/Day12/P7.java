package Day12;
interface actionTaken{
	public abstract String action();
};

enum Traffic3 implements actionTaken{
	RED 
	{
		@Override
		public String action() {
			// TODO Auto-generated method stub
			return "STOP";
		}
	}, 
	GREEN {
		@Override
		public String action() {
			// TODO Auto-generated method stub
			return "GO!!";
		}
	}, 
	YELLOW{
		@Override
		public String action() {
			// TODO Auto-generated method stub
			return "READY!";
		}
	};
}

public class P7 {
	public static void main(String[] args) {
		System.out.println(Traffic3.RED.action());
		System.out.println(Traffic3.YELLOW.action());
		System.out.println(Traffic3.GREEN.action());
		
	}

}
