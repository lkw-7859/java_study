package w19_5;

import w19_1.Wearable;
import w19_2.Skinnable;

public class HeadMountedDisplayTester {

	public static void main(String[] args) {
		HeadMountedDisplay hmd = new HeadMountedDisplay();
		hmd.putOn();
		hmd.putOff();
		hmd.changeSkin(Skinnable.YELLOW);
		hmd.putSkin();
	
		Wearable w = hmd;
		w.putOn();
		w.putOff();
	
		Skinnable s = hmd;
		s.changeSkin(Skinnable.BLACK);
		
		hmd.putSkin();
	}

}
