package com.darksoldier1404.dptr;

import com.darksoldier1404.dptr.commands.DPTRCommand;
import com.darksoldier1404.dppc.data.DPlugin;
import com.darksoldier1404.dppc.utils.PluginUtil;
import com.darksoldier1404.dptr.events.DPTREvent;
import com.darksoldier1404.dptr.functions.DPTRFunction;

public class ToolRepair extends DPlugin {
    public static ToolRepair plugin;
    private static int moneyCostPerDurability;
    private static int expCostPerDurability;
    private static boolean enableMoneyCost;
    private static boolean enableExpCost;

    public ToolRepair() {
        super(true);
        plugin = this;
        init();
    }

    public static int getMoneyCostPerDurability() {
        return moneyCostPerDurability;
    }

    public static void setMoneyCostPerDurability(int moneyCostPerDurability) {
        ToolRepair.moneyCostPerDurability = moneyCostPerDurability;
    }

    public static int getExpCostPerDurability() {
        return expCostPerDurability;
    }

    public static void setExpCostPerDurability(int expCostPerDurability) {
        ToolRepair.expCostPerDurability = expCostPerDurability;
    }

    public static boolean isEnableMoneyCost() {
        return enableMoneyCost;
    }

    public static void setEnableMoneyCost(boolean enableMoneyCost) {
        ToolRepair.enableMoneyCost = enableMoneyCost;
    }

    public static boolean isEnableExpCost() {
        return enableExpCost;
    }

    public static void setEnableExpCost(boolean enableExpCost) {
        ToolRepair.enableExpCost = enableExpCost;
    }

    @Override
    public void onLoad() {
        PluginUtil.addPlugin(plugin, 28502);
    }

    @Override
    public void onEnable() {
        DPTRFunction.init();
        getServer().getPluginManager().registerEvents(new DPTREvent(), plugin);
        DPTRCommand.init();
    }

    @Override
    public void onDisable() {
        saveAllData();
    }
}
