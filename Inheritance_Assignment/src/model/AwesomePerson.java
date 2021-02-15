package model;

public class AwesomePerson extends Person {
	
	public AwesomePerson() {
		this.name = "Zack";
		this.age = 26;
		
		System.out.println("AwesomePerson Constructor");
	}
	
	public void talk() {
		System.out.println("Hello my name is " + this.name + " and I'm " + this.age + " years old");
	}
}
