package me.dereksam.items;

public class ItemShields extends Item {

	public ItemShields(String name, int weight, int str, int wis, int vit,
			int dmg, int def) {
		super(name, weight, str, wis, vit, dmg, def);
	}
	
	public static Item woodenShield = new Item("Wooden Shield", 3, 0, 0, 2, 0, 1);
	public static Item ironShield = new Item("Iron Shield", 3, 0, 0, 3, 0, 3);
	public static Item steelShield = new Item("Steel Shield", 4, 0, 0, 4, 0, 5);
}
