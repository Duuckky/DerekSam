package me.dereksam.items;

public class ItemLeatherBody extends Item {
	
	public ItemLeatherBody(String name, int itemID, int dmg, int weight,
			int vit) {
		super(name, itemID, dmg, weight, vit);
	}

	public static Item leatherBody = new Item("Leather Body", 3, 0, 2, 3);
}