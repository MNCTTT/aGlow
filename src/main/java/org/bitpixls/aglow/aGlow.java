package org.bitpixls.aglow;

import org.bukkit.plugin.java.JavaPlugin;

public final class aGlow extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("glow").setExecutor(new GlowCommand());
        getCommand("aglow").setExecutor(new GlowCommand());
        int pluginId = 19901;
        Metrics metrics = new Metrics(this, pluginId);
    }

    @Override
    public void onDisable() {
    }
}
