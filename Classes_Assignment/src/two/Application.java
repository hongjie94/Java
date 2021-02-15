package two;

public class Application {
	public static void main(String[] args) {
		PrivatePerson pp = new PrivatePerson();
		pp.setAge(26);
		pp.setName("Zack");

		System.out.println("Name: " + pp.getName() + ", Age: " + pp.getAge());
		
		PrivateDog pd = new PrivateDog();
		pd.setDogAge(5);
		pd.setDogName("nono");
		System.out.println("Dog Name: " + pd.getDogName() + ", Dog Age: " + pd.getDogAge());
	}
}
