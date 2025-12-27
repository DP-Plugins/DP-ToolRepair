package com.darksoldier1404.dptr.commands;

import com.darksoldier1404.dppc.builder.command.CommandBuilder;
import com.darksoldier1404.dptr.functions.DPTRFunction;

import static com.darksoldier1404.dptr.ToolRepair.plugin;


public class DPTRCommand {
    private static final CommandBuilder builder = new CommandBuilder(plugin);

    public static void init() {
        builder.beginSubCommand("open", plugin.getLang().get("command_open_description"))
                .withPermission("dptr.use")
                .executesPlayer((p, args) -> {
                    DPTRFunction.openToolRepairGUI(p);
                    return true;
                });
        builder.beginSubCommand("reload", plugin.getLang().get("command_reload_description"))
                .withPermission("dptr.admin")
                .executes((sender, args) -> {
                    plugin.reload();
                    DPTRFunction.init();
                    sender.sendMessage(plugin.getPrefix() + plugin.getLang().get("message_reload_success"));
                    return true;
                });
        builder.build("dptr");
    }
}