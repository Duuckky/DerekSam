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
	
	public static void setupRole(int roleID) {
		switch (roleID) {
		case 1:
			Role.setupRole(RoleTypes.ARCHER);
			break;
		case 2:
			Role.setupRole(RoleTypes.THIEF);
			break;
		case 3:
			Role.setupRole(RoleTypes.WARRIOR);
			break;
		case 4:
			Role.setupRole(RoleTypes.MAGE);
			break;
		default:
			break;
		}
	}
		
	public static String getRole() { return roleName; }
}
