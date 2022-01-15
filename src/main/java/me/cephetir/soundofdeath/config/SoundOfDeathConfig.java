package me.cephetir.soundofdeath.config;

import gg.essential.vigilance.Vigilant;
import gg.essential.vigilance.data.Property;
import gg.essential.vigilance.data.PropertyType;
import me.cephetir.soundofdeath.SoundOfDeath;

import java.io.File;

public class SoundOfDeathConfig extends Vigilant {
    @Property(
            type = PropertyType.SWITCH,
            name = "Play Sound on Death",
            description = "Play Sound on Death.",
            category = "General"
    )
    public static boolean onDeath = true;

    @Property(
            type = PropertyType.TEXT,
            name = "Sound Name",
            description = "Audio file .wav place in .minecraft/config/soundofdeath and type name here.",
            category = "General"
    )
    public static String name = "";

    public SoundOfDeathConfig() {
        super(new File(SoundOfDeath.ID + ".toml"), SoundOfDeath.NAME);
        initialize();
    }
}
