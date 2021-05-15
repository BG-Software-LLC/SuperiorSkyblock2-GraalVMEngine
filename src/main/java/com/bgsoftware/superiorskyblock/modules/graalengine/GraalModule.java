package com.bgsoftware.superiorskyblock.modules.graalengine;

import com.bgsoftware.superiorskyblock.api.SuperiorSkyblock;
import com.bgsoftware.superiorskyblock.api.commands.SuperiorCommand;
import com.bgsoftware.superiorskyblock.api.modules.PluginModule;
import com.bgsoftware.superiorskyblock.scripts.GraalScript;
import org.bukkit.event.Listener;

public final class GraalModule extends PluginModule {

    public GraalModule(){
        super("graal-engine", "Ome_R");
    }

    @Override
    public void onEnable(SuperiorSkyblock superiorSkyblock) {
        superiorSkyblock.setScriptEngine(GraalScript.getInstance());
    }

    @Override
    public void onReload(SuperiorSkyblock superiorSkyblock) {

    }

    @Override
    public void onDisable(SuperiorSkyblock superiorSkyblock) {
        superiorSkyblock.setScriptEngine(null);
    }

    @Override
    public Listener[] getModuleListeners(SuperiorSkyblock superiorSkyblock) {
        return null;
    }

    @Override
    public SuperiorCommand[] getSuperiorCommands(SuperiorSkyblock superiorSkyblock) {
        return null;
    }

    @Override
    public SuperiorCommand[] getSuperiorAdminCommands(SuperiorSkyblock superiorSkyblock) {
        return null;
    }

}
