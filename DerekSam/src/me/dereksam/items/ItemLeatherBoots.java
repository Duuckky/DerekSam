package me.dereksam.items;

public class ItemLeatherBoots extends Item {
	
	public ItemLeatherBoots(String name, int itemID, int dmg, int weight,
			int vit) {
		super(name, itemID, dmg, weight, vit);
	}

	public static Item leatherBoots = new Item("Leather Boots", 6, 0, 1, 1);
}