package me.dereksam.main;

public class Main {
	
	private static String name;
	private static String lastName;
	
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		System.out.println("Sam has no friends");
		System.out.println("derek ur a fgt");
		
		setName("Derek");
		setLastName("Marshall");
		System.out.println(getFullName());
	}
	
	public static void setName(String x) {
		name = x;
	}
	
	public static void setLastName(String x) {
		lastName = x;
	}

	public static String getName() { return name; }
	public static String getLastName() { return lastName; }
	public static String getFullName() { return name + " " + lastName; }
}

