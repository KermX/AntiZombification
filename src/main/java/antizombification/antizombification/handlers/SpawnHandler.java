package antizombification.antizombification.handlers;

import antizombification.antizombification.AntiZombification;
import org.bukkit.Bukkit;
import org.bukkit.entity.*;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntitySpawnEvent;

import java.util.Objects;

public class SpawnHandler implements  Listener{
    public SpawnHandler(AntiZombification plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onSpawn(EntitySpawnEvent event) {
        EntityType SpawnedEntity = event.getEntityType();
        String SpawnWorld = Objects.requireNonNull(event.getLocation().getWorld()).getName();


        if (SpawnWorld.equalsIgnoreCase("world")) {
            if (SpawnedEntity == EntityType.PIGLIN) {
                PiglinAbstract piglin = (PiglinAbstract)event.getEntity();
                piglin.setImmuneToZombification(true);
            }
            if (SpawnedEntity == EntityType.HOGLIN) {
                Hoglin hoglin = (Hoglin)event.getEntity();
                hoglin.setImmuneToZombification(true);
            }
            if (SpawnedEntity == EntityType.PIGLIN_BRUTE){
                PiglinBrute piglinbrute = (PiglinBrute)event.getEntity();
                piglinbrute.setImmuneToZombification(true);
            }


        }

    }
}
