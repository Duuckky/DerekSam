package me.dereksam.main;

public class Main {
	
	private static String name;
	
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		System.out.println("Sam has no friends");
		System.out.println("derek ur a fgt");
		
		setName("Derek");
		System.out.println(getName());
	}
	
	public static void setName(String x) {
		name = x;
	}
	
	public static String getName() { return name; }
}

