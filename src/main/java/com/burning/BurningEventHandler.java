package com.burning;

import com.hj.rpgsharp.rpg.apis.rpgsharp.events.RPGLevelUpEvent;
import com.hj.rpgsharp.rpg.objects.RPGPlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

public class BurningEventHandler implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public void BurningRPGLevelUp(RPGLevelUpEvent rpgLevelUpEvent) {
        if (rpgLevelUpEvent.isCancelled())
            return;

        RPGPlayer rpgPlayer = rpgLevelUpEvent.getRPGPlayer();

//        if (rpgPlayer.getLevel()%2==1){
//            System.out.println("홀수 버닝 미적용");
//            return;
//        }
//
//        if (rpgPlayer.getLevel() >= 199){
//            System.out.println("199랩 이상 버닝 미적용");
//            return;
//        }

        if (rpgPlayer.getLevel() <= 199 && rpgPlayer.getLevel()%2==1){
            rpgPlayer.setExp(rpgPlayer.getMaxExp());
            System.out.println("버닝 적용");
            System.out.println(rpgPlayer.getNickname() + "burning levelup " + rpgPlayer.getLevel());
        }
        else {
            System.out.println("버닝 미적용");
        }
    }
}
