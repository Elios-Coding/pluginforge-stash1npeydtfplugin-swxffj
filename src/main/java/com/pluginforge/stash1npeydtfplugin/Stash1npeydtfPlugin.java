package com.pluginforge.stash1npeydtfplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Stash1npeydtfPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        saveDefaultConfig();
        StashCommand command = new StashCommand(this);
        if (getCommand("stash") != null) {
            getCommand("stash").setExecutor(command);
            getCommand("stash").setTabCompleter(command);
        }
        getServer().getPluginManager().registerEvents(command, this);
        getLogger().info("Stash1npeydtfPlugin enabled.");
    }
}
