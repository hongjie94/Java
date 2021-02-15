package three;

public class AngryDog {
	String bark;
	int barkTimes;
	
	public AngryDog(String bark, int barkTimes) {
		super();
		this.bark = bark;
		this.barkTimes= barkTimes;
	}
	
	public void barking() {
		System.out.println("Angry Dog Barking " + this.bark + " " + this.barkTimes + " Times");
	}
}
