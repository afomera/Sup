package com.bitlimit.Sup;

import org.bukkit.plugin.java.JavaPlugin;

public class Sup extends JavaPlugin {

    @Override
    public void onEnable() {
        new SupListener(this); //Enables the Listener Class

        getLogger().info("Sup.jar has been enabled"); //print to console it's enable

        this.getCommand("sup").setExecutor(new SupCommandExecutor(this)); //Sets command executor for /sup

    }

    @Override
    public void onDisable() {
        getLogger().info("Sup.jar is now disabled");
    }
}
