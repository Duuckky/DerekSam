package me.dereksam.items;

public class ItemWoodenSword extends Item{
	
	public ItemWoodenSword(String name, int itemID, int dmg, int weight, int vit) {
		super(name, id, dmg, weight, vit);
	}
	
	public static Item woodenSword = new Item("Wooden Sword", 0, 1, 1, 0);
}
