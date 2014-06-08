package me.dereksam.playerdata;

public class Race {

	private static String raceName;
	
	public static void setupRace(int raceID) {
		
		Player player = new Player();
		
		switch (raceID) {
		case 1:
			player.setRace(RaceTypes.GOBLIN);
			break;
		case 2:
			player.setRace(RaceTypes.ELF);
			break;
		case 3:
			player.setRace(RaceTypes.DWARF);
			break;
		case 4:
			player.setRace(RaceTypes.HUMAN);
			break;
		case 5:
			player.setRace(RaceTypes.GNOME);
			break;
		case 6:
			player.setRace(RaceTypes.ORC);
			break;
		case 7:
			player.setRace(RaceTypes.TROLL);
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
