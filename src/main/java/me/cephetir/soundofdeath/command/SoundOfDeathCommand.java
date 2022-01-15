package me.cephetir.soundofdeath.command;

import gg.essential.api.EssentialAPI;
import me.cephetir.soundofdeath.SoundOfDeath;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

import java.util.Collections;
import java.util.List;

public class SoundOfDeathCommand extends CommandBase {

    @Override
    public String getCommandName() {
        return "soundofdeath";
    }

    @Override
    public List<String> getCommandAliases() {
        return Collections.singletonList("sod");
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return null;
    }

    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        EssentialAPI.getGuiUtil().openScreen(SoundOfDeath.config.gui());
    }
}