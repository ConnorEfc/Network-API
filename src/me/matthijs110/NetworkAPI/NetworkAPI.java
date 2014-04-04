package me.matthijs110.NetworkAPI;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class NetworkAPI extends JavaPlugin {
	
	/*
	 * To use this API, do the following:
	 * 	- Add this API to the Java build path
	 *  - Get the instance of Network-API
	 *  
	 *  Should be easy!
	 */
	
	public void onEnable() {
		System.out.print("Network-API Loaded!");
	}
	
	public void onDisable() {
		System.out.print("Network-API Unloaded!");
	}
	
	public void NetworkPrefix() {
		@SuppressWarnings("unused")
		String prefix = ChatColor.DARK_GRAY + "[" + ChatColor.RED + "ServerName" + ChatColor.DARK_GRAY + "]";
	}
}
