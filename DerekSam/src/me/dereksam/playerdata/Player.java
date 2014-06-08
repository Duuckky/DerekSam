package me.dereksam.playerdata;

public class Player {

	private String name;
	
	private String race;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setGoal(String goal) {
		
	}
	
	public void setRace(RaceTypes race) {
		switch (race) {
		case GOBLIN:
			this.race = "Goblin";
			break;
		case ORC:
			this.race = "Orc";
			break;
		case HUMAN:
			this.race = "Human";
			break;
		case ELF:
			this.race = "Elf";
			break;
		case DWARF:
			this.race = "Dwarf";
			break;
		case GNOME:
			this.race = "Gnome";
			break;
		case TROLL:
			this.race = "Troll";
			break;
		default:
			break;
		}
	}
	
	public String getRace() {
		return race;
	}
}
