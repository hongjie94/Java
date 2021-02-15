package com.mycompany.main;

public class Application {
	public static void main(String[] args) {
		float x,y;
		x = 360.530f;
		y = 1365.123f;
		
		System.out.println("Sum of two float is: " + StaticClass.sum(x,y));
		
		FinalClass fc = new FinalClass();
		System.out.println("My Final Constant is: " + fc.myConstant);
		
		ConcreteClass cc =  new ConcreteClass();
		cc.run();		
	}
}
