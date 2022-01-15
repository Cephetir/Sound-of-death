package me.cephetir.soundofdeath;

import me.cephetir.soundofdeath.command.SoundOfDeathCommand;
import me.cephetir.soundofdeath.config.SoundOfDeathConfig;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = SoundOfDeath.ID, name = SoundOfDeath.NAME, version = SoundOfDeath.VER)
public class SoundOfDeath {
    public static final String NAME = "@NAME@", VER = "@VER@", ID = "@ID@";
    public static SoundOfDeathConfig config;

    @Mod.EventHandler
    protected void onInitialization(FMLInitializationEvent event) {
        ClientCommandHandler.instance.registerCommand(new SoundOfDeathCommand());
        config = new SoundOfDeathConfig();
        config.preload();
        MinecraftForge.EVENT_BUS.register(new Handler());
    }
}
