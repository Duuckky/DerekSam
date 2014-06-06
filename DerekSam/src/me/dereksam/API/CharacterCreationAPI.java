package me.dereksam.API;

import java.util.Scanner;

import me.dereksam.items.ItemWoodenSword;
import me.dereksam.playerdata.Race;
import me.dereksam.playerdata.Role;

public class CharacterCreationAPI {
	
	public static int raceID;
	public static int roleID;
	public static boolean inCharacterSelection;
	public static int answerKey;

	public static void characterCreation() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		inCharacterSelection = true;
		
		while (inCharacterSelection) {
			API.sendMessage("Please enter you race: ");
			API.listRaces();
			InventoryAPI.addItem(ItemWoodenSword.woodenSword);
			raceID = scan.nextInt();
			Race.setupRace(raceID);
			API.sendMessage("Please enter your role");
			API.listRoles();
			roleID = scan.nextInt();
			Role.setupRole(roleID);
			API.sendMessage("Race: " + Race.getRace());
			API.sendMessage("Role: " + Role.getRole());
			API.sendMessage("Is this correct?");
			API.sendMessage("1. Yes");
			API.sendMessage("2. No");
			answerKey = scan.nextInt();
			if(answerKey == 1) {
				inCharacterSelection = false;
			}
		}
	}
}
