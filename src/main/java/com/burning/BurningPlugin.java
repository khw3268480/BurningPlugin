package com.burning;

import org.bukkit.plugin.java.JavaPlugin;

public class BurningPlugin extends JavaPlugin {
    @Override
    public void onDisable() {
        getLogger().info("burning plugin off");
    }

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new BurningEventHandler(), this);
        getLogger().info("burning plugin on");
    }
}
