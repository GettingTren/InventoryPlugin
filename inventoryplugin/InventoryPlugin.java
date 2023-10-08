package me.ilgroggo.inventoryplugin;

import me.ilgroggo.inventoryplugin.commands.MenuCommand;
import me.ilgroggo.inventoryplugin.listeners.InventoryMoveListener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class InventoryPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        Objects.requireNonNull(getCommand("menu")).setExecutor(new MenuCommand());
        getServer().getPluginManager().registerEvents(new InventoryMoveListener(), this);

    }
}
