package me.dereksam.API;

import me.dereksam.main.Main;
import me.dereksam.playerdata.Race;
import me.dereksam.playerdata.RaceTypes;
import me.dereksam.playerdata.Role;
import me.dereksam.playerdata.RoleTypes;

public class API {
	
	public static void sendMessage(String message) {
		System.out.println(message);
	}
	
	public static void listRaces() {
		API.sendMessage("1. " + Main.raceList[0]);
		API.sendMessage("2. " + Main.raceList[1]);
		API.sendMessage("3. " + Main.raceList[2]);
		API.sendMessage("4. " + Main.raceList[3]);
		API.sendMessage("5. " + Main.raceList[4]);
		API.sendMessage("6. " + Main.raceList[5]);
		API.sendMessage("7. " + Main.raceList[6]);
	}
	
	public static void listRoles() {
		API.sendMessage("1. " + Main.roleList[0]);
		API.sendMessage("2. " + Main.roleList[1]);
		API.sendMessage("3. " + Main.roleList[2]);
		API.sendMessage("4. " + Main.roleList[3]);
	}
	
	public static void setupRace(int raceID) {
		switch (raceID) {
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
	}
	
	public final static void clearConsole() {
		System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
	
	public static void setupRole(int roleID) {
		switch (roleID) {
		case 1:
			Role.setupRole(RoleTypes.ARCHER);
			break;
		case 2:
			Role.setupRole(RoleTypes.THIEF);
			break;
		case 3:
			Role.setupRole(RoleTypes.WARRIOR);
			break;
		case 4:
			Role.setupRole(RoleTypes.MAGE);
			break;
		default:
			break;
		}
	}
}
