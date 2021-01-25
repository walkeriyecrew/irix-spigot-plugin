package com.eek.irix;

import com.eek.irix.events.irixEvents;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static String pluginName = "[irix]: ";

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new irixEvents(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + pluginName + "Plugin Enabled");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + pluginName + "Plugin Disabled");
    }
}
