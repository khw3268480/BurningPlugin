import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Logger;

public class Burning extends JavaPlugin {
    @Override
    public void onDisable() {
        getLogger().info("burning plugin off");
    }

    @Override
    public void onEnable() {
        getLogger().info("burning plugin on");
    }
}
