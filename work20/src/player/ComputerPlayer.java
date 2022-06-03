package player;

import java.util.Random;

public class ComputerPlayer {
	Random rd = new Random();
	
	public int nextHand() {
		int hand = rd.nextInt(3);
		return hand;
	}
}
