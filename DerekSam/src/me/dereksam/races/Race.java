package me.dereksam.races;

public class Race {

	private static String raceName;
	
	public static void setupRace(RaceTypes race) {
		switch (race) {
		case ELF:
			setRace("elf");
			break;
		case HUMAN:
			setRace("human");
			break;
		case GOBLIN:
			setRace("goblin");
			break;
		case ORC:
			setRace("orc");
			break;
		case TROLL:
			setRace("troll");
			break;
		case GNOME:
			setRace("gnome");
			break;
		case DWARF:
			setRace("dwarf");
			break;
		default:
			setRace(null);
			break;
		}
	}
		
	private static void setRace(String race) {
		raceName = race;
	}
		
	public static String getRace() { return raceName; }
}
