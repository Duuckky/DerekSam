package me.dereksam.playerdata;

import java.util.ArrayList;
import java.util.Scanner;

import me.dereksam.API.API;
import me.dereksam.items.Item;

public class Inventory {

	public static ArrayList<String> inventory = new ArrayList<String>();
	public static ArrayList<Item> equipped = new ArrayList<Item>();
	
	public static boolean inventoryOpen;
	public static boolean inventoryDisplay;
	public static int i;
	public static String selection;

	public static void addItem(Item item) {
		inventory.add(item.getName());
	}	
	
	public static void removeItem(Item item) {
		inventory.remove(item);
	}
	
	public static void clearInventory() {
		inventory.clear();
	}
	
	public static void equipItem(Item item) {
		equipped.add(item);
		inventory.remove(item);
	}
	
	public static void unEquip(Item item) {
		inventory.add(item.getName());
		equipped.remove(item);
	}
	
	public static void showItemStats() {
		
	}
	
	public static void openInventory() {
		inventoryOpen = true;
		
		
			if(inventoryOpen) {
				while (i < inventory.size()) {
					API.sendMessage(i + 1 + ". " + inventory.get(i));
					i++;
				}
			}
	}
	
	public static void inventoryMenu() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		API.sendMessage("\nInventory opened");
		API.sendMessage("----------------");
		openInventory();
		API.sendMessage("Type the number beside the item name for more information.");
		API.sendMessage("Type e to exit the inventory.");
		selection = scan.nextLine();
		
		switch (selection) {
		case "e":
			closeInventory();
			API.sendMessage("Inventory closed");
			break;
		}
		
		
		
	}
	
	public static void closeInventory() {
		inventoryOpen = false;
	}
}
