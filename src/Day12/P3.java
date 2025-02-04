package Day12;


import java.util.*;

enum Traffic1{
	RED,GREEN,YELLOW	
}

public class P3 {
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		Traffic1 light = Traffic1.valueOf( s.next().toUpperCase());
		switch(light) {
		case RED : 
			System.out.println("Stop");
			break;
		case GREEN:
			System.out.println("Go!!!!");
			break;
		case YELLOW:
			System.out.println("REady!!");
			break;
		default:
			System.out.println("Invalid");
		}
	}
}
