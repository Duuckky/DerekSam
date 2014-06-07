package me.dereksam.items;

public class ItemLeatherGloves extends Item {
	
	public ItemLeatherGloves(String name, int itemID, int dmg, int weight,
			int vit) {
		super(name, itemID, dmg, weight, vit);
	}

	public static Item leatherGloves = new Item("LeatherGloves", 5, 0, 1, 1);
}