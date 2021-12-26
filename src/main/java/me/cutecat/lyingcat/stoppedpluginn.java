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
        plugin.getLogger().info("Scan Completed");
    }

    public static void startownera() {
        Bukkit.getServer().getWorlds().forEach(worldaa -> {
            worldaa.getEntities().forEach(Ineedcat -> {
                if (Ineedcat instanceof Cat) {
                    if (((Cat) Ineedcat).isTamed()) {
                        if (Objects.equals(plugin.getConfig().getString("Require-perm"), String.valueOf(true))) {
                            if (!Bukkit.getPlayer(((Cat) Ineedcat).getOwnerUniqueId()).hasPermission("LyingCat.lying")) {
                                return;
                            }
                        }
                if (((Cat) Ineedcat).isSitting()) {
                    ((Cat) Ineedcat).setLyingDown(true);
                }

                    }
                }
            });
        });
        plugin.getLogger().info("Startup Scan Completed");
    }
}
