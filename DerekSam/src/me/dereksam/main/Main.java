package me.dereksam.main;

import java.util.Scanner;

import me.dereksam.API.API;

public class Main {
	
	/*
	 * TODO Inventory
	 * TODO Race
	 * TODO Class - Done
	 * TODO Story
	 * TODO Character Creation
	 * TODO Name
	 */

	public static String[] raceList = { "Goblin", "Elf", "Dwarf", "Human", "Gnome", "Orc", "Troll" };
	public static String[] roleList = { "Archer", "Thief", "Warrior", "Mage" };
	
	public static int raceID;
	public static int roleID;
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		API.sendMessage("Please enter you race: ");
		API.listRaces();
		
		raceID = scan.nextInt();
		API.setupRace(raceID);
		API.sendMessage("Please enter your role");
		API.listRoles();
		roleID = scan.nextInt();
		API.setupRole(roleID);
		API.clearConsole();
		
		// To get input type <variable> = scan.nextLine();
	}
}

