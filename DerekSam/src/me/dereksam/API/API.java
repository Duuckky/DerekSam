package me.dereksam.API;

import me.dereksam.main.Main;

public class API {
	
	public static void sendMessage(String message) {
		System.out.println(message);
	}
	
	public static void listRaces() {
		for(int i = 0; i < Main.raceList.length; i++) {
			API.sendMessage(i + 1 + ". " + Main.raceList[i]);
		}
	}
	
	public static void listRoles() {
		for(int i = 0; i < Main.roleList.length; i++) {
			API.sendMessage(i + 1 + ". " + Main.roleList[i]);
		}
	}

	
	public static void delay(long millis) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public final static void clearConsole() {
		System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
}
