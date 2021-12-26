package me.cutecat.lyingcat;

import org.bukkit.Bukkit;
import org.bukkit.entity.Cat;
import org.bukkit.plugin.Plugin;

import java.util.Objects;

public class stoppedpluginn {
    static Plugin plugin = lyingCat.getPlugin(lyingCat.class);

    public static void findingowner() {
        Bukkit.getServer().getWorlds().forEach(worldaa -> {
            worldaa.getEntities().forEach(Ineedcat -> {
                if (Ineedcat instanceof Cat) {

                    ((Cat) Ineedcat).setLyingDown(false);

                }
            });
        });
    }

    public static void startownera() {
        Bukkit.getServer().getWorlds().forEach(worldaa -> {
            worldaa.getEntities().forEach(Ineedcat -> {
                if (Ineedcat instanceof Cat) {
                    if (Objects.equals(plugin.getConfig().getString("Require-perm"), String.valueOf(true))) {
                        if (!Bukkit.getPlayer(((Cat) Ineedcat).getOwnerUniqueId()).hasPermission("LyingCat.lying")) {
                            return;
                        }
                    }

                    ((Cat) Ineedcat).setLyingDown(true);

                }
            });
        });
    }
}
