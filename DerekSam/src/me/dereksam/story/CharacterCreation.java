package me.dereksam.story;

import java.util.Scanner;

import me.dereksam.API.API;
import me.dereksam.playerdata.Player;
import me.dereksam.playerdata.Race;
import me.dereksam.playerdata.Role;

public class CharacterCreation {
	
	public static int raceID;
	public static int roleID;
	public static boolean inCharacterSelection;
	public static int answerKey;

	public static void characterCreation() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Player player = new Player();

		inCharacterSelection = true;
		
		while (inCharacterSelection) {
			API.sendMessage("Please enter you race: ");
			API.listRaces();
			raceID = scan.nextInt();
			Race.setupRace(raceID);
			API.sendMessage("Please enter your role");
			API.listRoles();
			roleID = scan.nextInt();
			Role.setupRole(roleID);
			API.sendMessage("Race: " + player.getRace());
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
