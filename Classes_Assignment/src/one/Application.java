package one;

public class Application {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "Zack";
		p.age = 26;
		
		Dog myDog = new Dog();
		myDog.name = "nono";
		myDog.age = 5;
		System.out.println("Name: " + p.name + ", Age: " + p.age);
		System.out.println("Dog Name: " + myDog.name + ",  Dog Age: " + myDog.age + " years old");
		
	}
}
