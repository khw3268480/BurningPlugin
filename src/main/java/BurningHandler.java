import com.hj.rpgsharp.rpg.apis.rpgsharp.events.RPGLevelUpEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

public class BurningHandler implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public void BurningRPGLevelUp(RPGLevelUpEvent event) {
        if (event.isCancelled())
            return;
//        event.getRPGPlayer().setLevel(event.getRPGPlayer().getLevel()+1);
        getLogger().info(event.getRPGPlayer().getNickname()+"burning levelup");
    }
}
