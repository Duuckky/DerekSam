package me.dereksam.items;

public class ItemLeatherLeggings extends Item {
	
	public ItemLeatherLeggings(String name, int itemID, int dmg, int weight,
			int vit) {
		super(name, itemID, dmg, weight, vit);
	}

	public static Item leatherLeggings = new Item("Leather Leggings", 4, 0, 2, 2);
}