package Day4;

class State {
	String hpos;
	String vpos;
	String bpos;
	String banana;

	State(String h, String v, String b, String ban) {
		hpos = h;
		vpos = v;
		bpos = b;
		banana = ban;
	}

	void initial() {
		System.out.println("Initial Position \nMonkey = " + this.hpos + "\nBox = " + this.bpos);
		System.out.println();
	}

	void playgame() {
		if (this.banana == "has") {
			System.out.println("Monkey already has banana");
		} else {
			this.game();
		}
	}

	void graspbanana() {
		if (this.bpos == "middle") {
			this.vpos = "onbox";
			System.out.println("Monkey changes pos from onfloor to onbox");
			this.banana = "has";
			System.out.println("Monkey " + this.banana + " banana");
		} else {
			String temp = this.bpos;
			this.bpos = "middle";
			this.hpos = "middle";
			System.out.println("Box moved from " + temp + " to " + this.bpos + " by monkey");
			this.game();
		}
	}
	void move() {
		String temp = this.hpos;
		this.hpos = this.bpos;
		System.out.println("Monkey moved from " + temp + " to " + this.hpos);
		this.game();
		
	}

	void game() {

		if (this.hpos == this.bpos) {
			if (this.vpos != "onfloor") {
				this.vpos = "onfloor";
				System.out.println("Monkey changed pos from onbox to " + this.vpos);
			}

			this.graspbanana();
		} 
		else {
			if (this.vpos == "onbox") {
				System.out.println("You are provided a wrong data");
				System.out.println("Monkey and box position are different \n");
				System.out.println("Let the monkey postion = onfloor");
				this.vpos = "onfloor";
			}
			this.move();  
			
		}

	}
}

public class task1 {
	public static void main(String[] args) {
		State s1 = new State("atwindow", "onfloor", "atdoor", "hasnot");
		s1.initial();
		s1.playgame();

	}

}
