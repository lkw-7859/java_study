package player;

import java.util.Scanner;

public class HumanPlayer {
	Scanner sc = new Scanner(System.in);
	
	public int nextHand() {
		System.out.print("가위바위보!!! 0...가위/1...바위/2...보 : ");
		int hand = sc.nextInt();
		return hand;
	}
}
