package work18;

import w17_10.Shape;

public abstract class AbstTriangle extends Shape{
	private int length;
	
	public AbstTriangle(int length) {
		setLength(length);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public String toString() {
		return "AbsTriangle(length:" + length+")";
	}
}
