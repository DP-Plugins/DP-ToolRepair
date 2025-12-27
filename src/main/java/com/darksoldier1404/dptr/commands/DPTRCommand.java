package com.darksoldier1404.dptr.commands;

import com.darksoldier1404.dppc.builder.command.CommandBuilder;
import com.darksoldier1404.dptr.functions.DPTRFunction;

import static com.darksoldier1404.dptr.ToolRepair.plugin;


public class DPTRCommand {
    private static final CommandBuilder builder = new CommandBuilder(plugin);

    public static void init() {
        builder.beginSubCommand("open", "/dptr open - open the tool repair GUI")
                .withPermission("dptr.use")
                .executesPlayer((p, args) -> {
                    DPTRFunction.openToolRepairGUI(p);
                    return true;
                });
        builder.beginSubCommand("reload", "/dptr reload - reload the config")
                .withPermission("dptr.admin")
                .executes((sender, args) -> {
                    plugin.reload();
                    DPTRFunction.init();
                    sender.sendMessage(plugin.getPrefix() + "§aConfiguration reloaded.");
                    return true;
                });
        builder.build("dptr");
    }
}