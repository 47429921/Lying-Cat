package me.cutecat.lyingcat;

import de.leonhard.storage.Json;
import me.cutecat.lyingcat.corecat.catbed;
import org.bukkit.entity.Entity;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class lyingCat extends JavaPlugin {


    private static lyingCat plugin;
    @Override
    public void onEnable() {
        plugin = this;
        // Plugin startup logic
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        reloadConfig();
        getServer().getPluginManager().registerEvents(new catbed(), this);
        stoppedpluginn.startownera();


    getLogger().info("Plugin had been Started");


    }

    public static lyingCat getPlugin() {
        return plugin;
    }


    @Override
    public void onDisable() {
        stoppedpluginn.findingowner();

        getLogger().info("Plugin Stopped");

    }
}
