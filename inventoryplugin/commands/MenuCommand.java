package me.ilgroggo.inventoriesplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class MenuCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        String loreVersion = ChatColor.GREEN + "1.17-1.20+\n";


        if(commandSender instanceof Player){

            Player p = (Player) commandSender;
            Inventory inventory = Bukkit.createInventory(p, 27, ChatColor.BOLD + "Menu");

            // HELP ITEM

            ItemStack help = new ItemStack(Material.BOOK, 1); // create a new item
            ItemMeta helpMeta = help.getItemMeta(); // extract the metadata from the item
            assert helpMeta != null;
            helpMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Help"); // change the metadata of the item

            ArrayList<String> helpLore = new ArrayList<>();
            helpLore.add(ChatColor.BLUE + "Need help? Click me!");
            helpMeta.setLore(helpLore);

            help.setItemMeta(helpMeta); // replace the old metadata with the new metadata over the item
            inventory.setItem(11, help); // set slot position and then specify ItemStack object

            // SKYBLOCK ITEM

            ItemStack skyblock = new ItemStack(Material.OAK_SAPLING, 1);
            ItemMeta skyblockMeta = skyblock.getItemMeta();
            assert skyblockMeta != null;
            skyblockMeta.setDisplayName(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Skyblock");

            ArrayList<String> skyblockLore = new ArrayList<>();
            skyblockLore.add(loreVersion);
            skyblockLore.add(ChatColor.DARK_AQUA + "Click me to teleport ");
            skyblockLore.add(ChatColor.DARK_AQUA + "to your Skyblock World!");
            skyblockMeta.setLore(skyblockLore);

            skyblock.setItemMeta(skyblockMeta);
            inventory.setItem(12, skyblock);

            // BEDWARS ITEM

            ItemStack bedwars = new ItemStack(Material.RED_BED, 1);
            ItemMeta bedwarsMeta = bedwars.getItemMeta();
            assert bedwarsMeta != null;
            bedwarsMeta.setDisplayName(ChatColor.DARK_RED + "" + ChatColor.BOLD + "Bedwars");

            ArrayList<String> bedwarsLore = new ArrayList<>();
            bedwarsLore.add(loreVersion);
            bedwarsLore.add(ChatColor.DARK_RED + "Let the War begin!");
            bedwarsMeta.setLore(bedwarsLore);

            bedwars.setItemMeta(bedwarsMeta);
            inventory.setItem(13, bedwars);

            // KITPVP ITEM

            ItemStack kitpvp = new ItemStack(Material.DIAMOND_SWORD, 1);
            ItemMeta kitpvpMeta = kitpvp.getItemMeta();
            assert kitpvpMeta != null;
            kitpvpMeta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "KitPVP");

            ArrayList<String> kitpvpLore = new ArrayList<>();
            kitpvpLore.add(loreVersion);
            kitpvpLore.add(ChatColor.DARK_PURPLE + "Show them all who is ");
            kitpvpLore.add(ChatColor.DARK_PURPLE + "the best player at KitPVP!");
            kitpvpMeta.setLore(kitpvpLore);

            kitpvp.setItemMeta(kitpvpMeta);
            inventory.setItem(14, kitpvp);

            // SURVIVAL ITEM

            ItemStack survival = new ItemStack(Material.GRASS_BLOCK, 1);
            ItemMeta survivalMeta = survival.getItemMeta();
            assert survivalMeta != null;
            survivalMeta.setDisplayName(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Survival");

            ArrayList<String> survivalLore = new ArrayList<>();
            survivalLore.add(loreVersion);
            survivalLore.add(ChatColor.DARK_GREEN + "Survive, Build a village and Enjoy!");
            survivalMeta.setLore(survivalLore);

            survival.setItemMeta(survivalMeta);
            inventory.setItem(15, survival);

            // when player launch /menu
            p.openInventory(inventory);

        }

        return true;
    }
}
