package antizombification.antizombification.handlers;
import antizombification.antizombification.AntiZombification;
import org.bukkit.Bukkit;
import org.bukkit.entity.*;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityPortalEvent;

public class PortalTeleportHandler implements  Listener{
    public PortalTeleportHandler(AntiZombification plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPortalEnter(EntityPortalEvent event) {
        EntityType PortaledEntity = event.getEntityType();
        
            if (PortaledEntity == EntityType.PIGLIN) {
                PiglinAbstract piglin = (PiglinAbstract)event.getEntity();
                piglin.setImmuneToZombification(true);
            }
            if (PortaledEntity == EntityType.HOGLIN) {
                Hoglin hoglin = (Hoglin)event.getEntity();
                hoglin.setImmuneToZombification(true);
            }
            if (PortaledEntity == EntityType.PIGLIN_BRUTE){
                PiglinBrute piglinbrute = (PiglinBrute)event.getEntity();
                piglinbrute.setImmuneToZombification(true);
            }
            

    }
}
