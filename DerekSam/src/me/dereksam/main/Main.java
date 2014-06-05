package me.dereksam.main;

public class Main {
	
	private static String name;
	private static int age;
	
	public static void main(String[] args) {
		age = 15;
		System.out.println("Hello, World!");
		System.out.println("Sam has no friends");
		System.out.println("derek ur a fgt");
		System.out.println("I am currently " +age);
		age += 1;
		System.out.println("In 1 year I will be " +age);
		
		setName("Derek");
		System.out.println(getName());
	}
	
	public static void setName(String x) {
		name = x;
	}
	
	public static String getName() { return name; }
}

