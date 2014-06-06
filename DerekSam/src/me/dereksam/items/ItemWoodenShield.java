package me.dereksam.items;

public class ItemWoodenShield extends Item {
	
	public ItemWoodenShield(String name, int itemID, int dmg, int weight,
			int vit) {
		super(name, itemID, dmg, weight, vit);
	}

	public static Item woodenShield = new Item("Wooden Shield", 1, 0, 2, 1);
}
