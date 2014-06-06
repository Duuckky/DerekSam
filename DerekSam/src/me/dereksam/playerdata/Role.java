package me.dereksam.playerdata;

public class Role {

	private static String roleName;
	
	public static void setupRole(RoleTypes role) {
		switch (role) {
		case ARCHER:
			setRole("elf");
			break;
		case THIEF:
			setRole("human");
			break;
		case WARRIOR:
			setRole("goblin");
			break;
		case MAGE:
			setRole("orc");
			break;
		default:
			setRole(null);
			break;
		}
	}
		
	private static void setRole(String role) {
		Role.roleName = role;
	}
		
	public static String getRace() { return roleName; }
}
