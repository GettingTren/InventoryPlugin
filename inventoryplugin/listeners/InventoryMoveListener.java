package me.ilgroggo.inventoryplugin.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.awt.*;

public class InventoryMoveListener implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent e){

        if(e.getView().getTitle().equalsIgnoreCase(ChatColor.BOLD + "Menu")){

            Player p = (Player) e.getWhoClicked();

            if(e.getCurrentItem() == null) { // nothing happens if a player click an empty spot
                return;
            }

            if(e.getCurrentItem().getType() == Material.BOOK){ // Help Book Item in the /menu Inventory
                p.sendMessage(ChatColor.BLUE + "Checkout GettingTren on Github! https://github.com/GettingTren");
            }

            if(e.getCurrentItem().getType() == Material.OAK_SAPLING){ // Skblock
                p.sendMessage(ChatColor.DARK_AQUA + "Skyblock Item Clicked!");
            }

            if(e.getCurrentItem().getType() == Material.RED_BED){ // Bedwars
                p.sendMessage(ChatColor.DARK_RED + "Bedwars Item Clicked!");
            }

            if(e.getCurrentItem().getType() == Material.DIAMOND_SWORD){ // KitPVP
                p.sendMessage(ChatColor.DARK_PURPLE + "KitPVP Item Clicked!");
            }

            if(e.getCurrentItem().getType() == Material.GRASS_BLOCK){ // Survival
                p.sendMessage(ChatColor.DARK_GREEN + "Survival Item Cliced!");
            }

            // you cant move items
            e.setCancelled(true);

        }

    }
}
