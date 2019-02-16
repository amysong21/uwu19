package collegeSquirrel;

import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner (System.in);
		System.out.println("please name your squirrel");
		Squirrel newPlayerSquirrel = new YourSquirrel(scan.next());
	}
}
