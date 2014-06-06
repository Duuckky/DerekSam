package me.dereksam.playerdata;

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
	
	public static void setupRace(int raceID) {
		switch (raceID) {
		case 1:
			Race.setupRace(RaceTypes.GOBLIN);
			break;
		case 2:
			Race.setupRace(RaceTypes.ELF);
			break;
		case 3:
			Race.setupRace(RaceTypes.DWARF);
			break;
		case 4:
			Race.setupRace(RaceTypes.HUMAN);
			break;
		case 5:
			Race.setupRace(RaceTypes.GNOME);
			break;
		case 6:
			Race.setupRace(RaceTypes.ORC);
			break;
		case 7:
			Race.setupRace(RaceTypes.TROLL);
			break;
		default:
			break;
		}
	}
		
	private static void setRace(String race) {
		raceName = race;
	}
		
	public static String getRace() { return raceName; }
}
