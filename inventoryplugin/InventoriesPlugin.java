package me.ilgroggo.inventoriesplugin;

import me.ilgroggo.inventoriesplugin.commands.MenuCommand;
import me.ilgroggo.inventoriesplugin.listeners.InventoryMoveListener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class InventoriesPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        Objects.requireNonNull(getCommand("menu")).setExecutor(new MenuCommand());
        getServer().getPluginManager().registerEvents(new InventoryMoveListener(), this);

    }
}
