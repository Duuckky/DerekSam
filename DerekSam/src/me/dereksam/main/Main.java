package me.dereksam.main;

import me.dereksam.API.API;
import me.dereksam.story.ChapterOne;
import me.dereksam.story.CharacterCreation;

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
	
	public static void main(String[] args) {
		
		CharacterCreation.characterCreation();
		API.clearConsole();
		API.clearConsole();
		API.clearConsole();
		ChapterOne.ChapterIntro();
	}
}

