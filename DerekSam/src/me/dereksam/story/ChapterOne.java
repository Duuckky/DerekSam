package me.dereksam.story;

import java.util.Scanner;

import me.dereksam.API.API;
import me.dereksam.playerdata.Player;

public class ChapterOne {
	
	public static String selection;
	public static boolean selectionValid = false;
	
	static Scanner scan = new Scanner(System.in);
	
	public static void ChapterIntro() {
		Player player = new Player();
		API.sendMessage("You wake up and see a little boy standing above you.");
		API.delay(5000);
		API.sendMessage(" 'Hello, wake up!' ");
		API.delay(5000);
		API.sendMessage(" 'Who are you? ' ");
		API.delay(5000);
		API.sendMessage("  Enter name: ");
		player.setName(scan.nextLine());

		while(!selectionValid) {
			API.sendMessage(" 'Oh... " + player.getName() + ", why are you here?' ");
			API.sendMessage("--------------------------");
			API.sendMessage("1. Army recruit on patrol");
			API.sendMessage("2. Going to see a friend");
			API.sendMessage("3. Gathering supplies from a neighboring village");
			API.sendMessage("4. Screw off kid");
			API.sendMessage("Please select one");
			selection = scan.nextLine();
			switch (selection) {
			case "1":
				selectionValid = true;
				StoryRecruit();
				break;
			case "2":
				selectionValid = true;
				StoryFriend();
				break;
			case "3":
				selectionValid = true;
				StoryGathering();
				break;
			case "4":
				selectionValid = true;
				StoryScrewOff();
				break;
			default:
				API.sendMessage("Invalid option try again");
				break;
			}
		}
	}
	
	public static void StoryRecruit() {
		API.sendMessage("'AWESOME! I hope to be in the army some day.'");
		Help();
	}
	
	public static void StoryFriend() {
		
	}
	
	public static void StoryGathering() {
		
	}
	
	public static void StoryScrewOff() {
		
	}
	
	public static void Help() {
		selectionValid = false;
		while(!selectionValid) {
			API.sendMessage("'Would you like some help?'");
			API.sendMessage("--------------------------");
			API.sendMessage("1. Sure");
			API.sendMessage("2. No thanks");
			API.sendMessage("Please select one");
			selection = scan.nextLine();
			if(selection.equalsIgnoreCase("1") || selection.equalsIgnoreCase("sure") || selection.equalsIgnoreCase("yes")) {
				API.sendMessage("'Okay, I'll take you to see my dad.'");
				API.delay(5000);
				API.sendMessage("The boy points towards the village and says");
				API.delay(5000);
				API.sendMessage("'The village is that way.'");
				API.delay(6000);
				API.sendMessage("You follow the boy to his village");
				API.delay(10000);
				inVillage();
				selectionValid = true;
			} else if(selection == "2" || selection.equalsIgnoreCase("no") || selection.equalsIgnoreCase("no thanks")){
				API.sendMessage("'Okay, well if you ever need anything my village is west of here.'");
				selectionValid = true;
			} else {
				API.sendMessage("Invalid option try again");
			}
		}
	}
	
	public static void inVillage() {
		API.sendMessage("As you approach the village and sees that zombies");
		API.sendMessage(" are burning down the village. The kid starts to cry.");
		API.sendMessage("You quickly grab him and try to run, but you trip on a rock.");
		API.sendMessage("You have to fight, what weapon will you choose?");
		API.sendMessage("--------------------------");
		
	}
}
