package me.dereksam.items;

public class Item {
	
	public static int id;
	public static String name;
	public static int dmg;
	public static int weight;
	public static int vit;
	
	public Item(String name, int itemID, int dmg, int weight, int vit) {
		Item.id = itemID;
		Item.name = name;
		Item.dmg = dmg;
		Item.weight = weight;
		Item.vit = vit;
	}
	
	public String getName() {
		return name;
	}
	
	public int getDmg() {
		return dmg;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public int getVit() {
		return vit;
	}
	
	public String getID() {
		return String.valueOf(id);
	}
}
