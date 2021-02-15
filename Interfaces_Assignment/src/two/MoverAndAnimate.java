package two;

public class MoverAndAnimate implements Animatable {

	@Override
	public void move() {
		System.out.println("This is move()");
		
	}

	@Override
	public void animate() {
		System.out.println("This is animate()");
		
	}

}
