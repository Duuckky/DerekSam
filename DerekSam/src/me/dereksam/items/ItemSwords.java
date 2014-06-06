package me.dereksam.items;

public class ItemSwords extends Item {

	public ItemSwords(String name, int weight, int str, int wis, int vit,
			int dmg, int def) {
		super(name, weight, str, wis, vit, dmg, def);
	}
	
	public static Item woodenSword = new Item("Wooden Sword", 1, 2, 0, 0, 2, 1);
	public static Item ironSword = new Item("Iron Sword", 2, 2, 0, 0, 3, 1);
	public static Item steelSword = new Item("Steel Sword", 3, 3, 0, 0, 4, 2);
	
	public static String getName() {
		//////
	}
}
