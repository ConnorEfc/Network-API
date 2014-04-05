package me.matthijs110.NetworkAPI;

import org.bukkit.ChatColor;

public class LoginKickMessages {
	
	/* 
	 * You can use this on a AsyncPlayerPreLoginEvent
	 */
	
	// » is \u00BB
	// « is \u00AB
	
	String KickPrefix = ChatColor.DARK_GRAY + "\00AB" + "§7Mini§6Game" + "\u00BB" + "\n";
	
	public String Maintenance() {
		String maintenance = KickPrefix + ChatColor.RED + "The server is currently in Maintenance!" + "\n" + "§aPlease check back later!";
		return maintenance;
	}
	
	public String DonatorOnly() {
		String donoronly = KickPrefix + ChatColor.YELLOW + "The server is only available for donators for testing!" + "\n" + "&aPlease check back later!";
		return donoronly;
	}

}
