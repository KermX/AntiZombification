package antizombification.antizombification;

import antizombification.antizombification.handlers.PortalTeleportHandler;
import antizombification.antizombification.handlers.SpawnHandler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiZombification extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("AntiZombification Started");

        new SpawnHandler(this);
        new PortalTeleportHandler(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("AntiZombification Stopped");
    }
}
