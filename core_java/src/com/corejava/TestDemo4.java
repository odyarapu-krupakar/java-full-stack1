package com.corejava;

public class TestDemo4 {
	
	//static method
	static void hello() {
		System.out.println("hello guys,good morning!");
	}
	//static main method
	//jvm class the main method to exeut !!
	public static void main(String[] args) {
	System.out.println("main method started ");
	System.out.println(Thread.currentThread());
	TestDemo4 t= new TestDemo4();
	
	//calling the static method directly
	hello();
	
	//calling tne instsnce method by using object reference variable;
	
	t.welcome();
	
	System.out.println("main method ended");

	}
	//instance metod
	void welcome() {
		System.out.println("well come to vcube !!");
	}

}
