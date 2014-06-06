package me.dereksam.main;

import java.util.ArrayList;

import me.dereksam.API.API;
import me.dereksam.API.CharacterCreationAPI;
import me.dereksam.items.Item;

public class Main {
	
	/*
	 * TODO Inventory
	 * TODO Race - Done
	 * TODO Class - Done
	 * TODO Story
	 * TODO Character Creation
	 * TODO Name
	 * TODO Statistics
	 */

	public static String[] raceList = { "Goblin", "Elf", "Dwarf", "Human", "Gnome", "Orc", "Troll" };
	public static String[] roleList = { "Archer", "Thief", "Warrior", "Mage" };
	public static ArrayList<Item> inventory = new ArrayList<Item>();
	
	public static void main(String[] args) {
		CharacterCreationAPI.characterCreation();
		API.sendMessage(String.valueOf(inventory.get(0)));
		// To get input type <variable> = scan.nextLine();
	}
}

