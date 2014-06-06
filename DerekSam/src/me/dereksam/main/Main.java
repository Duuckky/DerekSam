package me.dereksam.main;

import java.util.Scanner;

import me.dereksam.API.API;
import me.dereksam.races.Race;
import me.dereksam.races.RaceTypes;

public class Main {
	
	/*
	 * TODO Inventory
	 * TODO Race
	 * TODO Class
	 * TODO Story
	 * TODO Character Creation
	 * TODO Name
	 */
	
	public static int raceNum;
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		API.sendMessage("Please enter you race: ");
		API.sendMessage("1. Goblin");
		API.sendMessage("2. Elf");
		API.sendMessage("3. Dwarf");
		API.sendMessage("4. Human");
		API.sendMessage("5. Gnome");
		API.sendMessage("6. Orc");
		API.sendMessage("7. Troll");
		
		raceNum = scan.nextInt();
		
		switch (raceNum) {
		case 1:
			Race.setupRace(RaceTypes.GOBLIN);
			break;
		case 2:
			Race.setupRace(RaceTypes.ELF);
			break;
		case 3:
			Race.setupRace(RaceTypes.DWARF);
			break;
		case 4:
			Race.setupRace(RaceTypes.HUMAN);
			break;
		case 5:
			Race.setupRace(RaceTypes.GNOME);
			break;
		case 6:
			Race.setupRace(RaceTypes.ORC);
			break;
		case 7:
			Race.setupRace(RaceTypes.TROLL);
			break;
		default:
			break;
		}
		
		API.sendMessage(Race.getRace());
		
		// To get input type <variable> = scan.nextLine();
	}
}

