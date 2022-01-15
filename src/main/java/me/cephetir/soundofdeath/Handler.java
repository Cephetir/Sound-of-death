package me.cephetir.soundofdeath;

import gg.essential.api.EssentialAPI;
import me.cephetir.soundofdeath.config.SoundOfDeathConfig;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Handler {
    @SubscribeEvent
    protected void onChat(ClientChatReceivedEvent event) {
        if (!EssentialAPI.getMinecraftUtil().isHypixel() || SoundOfDeathConfig.name.equals("") || !SoundOfDeathConfig.onDeath) return;
        String message = event.message.getUnformattedText();
        String path = Minecraft.getMinecraft().mcDataDir + "/config/soundofdeath/" + SoundOfDeathConfig.name + (SoundOfDeathConfig.name.endsWith(".wav") ? "" : ".wav");
        if (message.contains("You died!")) {
            try {
                AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File(path));
                Clip clip = AudioSystem.getClip();
                clip.open(audioIn);
                clip.start();
            } catch (LineUnavailableException | IOException | UnsupportedAudioFileException e){
                e.printStackTrace();
            }
        } else if(message.contains("doogans")) { // TODO:need message
            try {
                AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File(path));
                Clip clip = AudioSystem.getClip();
                clip.open(audioIn);
                clip.start();
            } catch (LineUnavailableException | IOException | UnsupportedAudioFileException e){
                e.printStackTrace();
            }
        }
    }
}
