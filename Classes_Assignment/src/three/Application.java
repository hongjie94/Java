package three;

public class Application {
	public static void main(String[] args) {
		TalkablePerson tp = new TalkablePerson("Zack", 26);
		tp.talk();
		
		AngryDog ad = new AngryDog("Whoof! Whoof! Whoof!", 5);
		ad.barking();
	}
}
