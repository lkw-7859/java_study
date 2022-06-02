package w19_4;

public class Pet {
	private String name;
	private String masterName;
	
	public Pet(String name, String masterName) {
		this.name = name; this.masterName = masterName;
	}

	public String getName() {
		return name;
	}

	public String getMasterName() {
		return masterName;
	}
	
	public void introduce() {
		System.out.println("*나의 이르은 "+name+"입니다.");
		System.out.println("*주인의 이르은 "+masterName+"입니다.");
	}
}
