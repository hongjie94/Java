package four;

public class Application {
	public static void main(String[] args) {
		ConstructorPerson cp = new ConstructorPerson();
		ConstructorDog cd = new ConstructorDog();
		System.out.println("Name: " + cp.name + ", Age: " + cp.age);
		System.out.println("Dog Name: " + cd.dogName + ", Dog Age: " + cd.dogAge);
	}
}
