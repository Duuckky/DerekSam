package me.dereksam.main;

public class Main {
	
	private static String name;
<<<<<<< HEAD
	private static int age;
=======
	private static String lastName;
>>>>>>> 883126b13a0e17c2ab57e9a1cca1ecd8431e1ea2
	
	public static void main(String[] args) {
		age = 15;
		System.out.println("Hello, World!");
		System.out.println("Sam has no friends");
		System.out.println("derek ur a fgt");
		System.out.println("I am currently " +age);
		age += 1;
		System.out.println("In 1 year I will be " +age);
		
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

