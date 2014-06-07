package me.dereksam.items;

public class ItemLeatherHelmet extends Item {
	
	public ItemLeatherHelmet(String name, int itemID, int dmg, int weight,
			int vit) {
		super(name, itemID, dmg, weight, vit);
	}

	public static Item leatherHelmet = new Item("Leather Helmet", 2, 0, 2, 2);
}