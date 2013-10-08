package com.bitlimit.Sup;

import org.bukkit.event.Listener;

/**
 * Created with IntelliJ IDEA.
 * User: king601
 * Date: 10/7/13
 * Time: 8:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class SupListener implements Listener {
    private final Sup plugin; //Reference main plugin

    public SupListener(Sup plugin) {
        //Tell Plugin Manager You're the boss
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
        this.plugin = plugin;
    }

    //EventHandlers inserted Here

}
