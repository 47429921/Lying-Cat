package me.cutecat.lyingcat.corecat;

import io.papermc.paper.event.entity.EntityMoveEvent;
import me.cutecat.lyingcat.lyingCat;
import org.bukkit.Bukkit;

import org.bukkit.Material;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTameEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.world.WorldLoadEvent;
import org.bukkit.plugin.Plugin;

import java.util.Objects;


public class catbed implements Listener {




    @EventHandler
    public void PlayerInteractAtEntityEvent(PlayerInteractAtEntityEvent e){



        Plugin plugin = lyingCat.getPlugin(lyingCat.class);


            if (e.getRightClicked() instanceof Cat) {
                if (plugin.getConfig().getString("Require-perm") == String.valueOf(true)) {
                     if (!e.getPlayer().hasPermission("LyingCat.lying")) {
                         return;
                     }
                }
                //Is Cat
                if(((Cat) e.getRightClicked()).isTamed()) {

                if (((Cat) e.getRightClicked()).isSitting()) {
                    // is waking up
                    ((Cat) e.getRightClicked()).setLyingDown(false);
                } else {
                    if (!((Cat) e.getRightClicked()).isSitting()) {
                        //is sitting down
                        ((Cat) e.getRightClicked()).setLyingDown(true);
                    }
                }

                } //Tamed




        }













    }




}
