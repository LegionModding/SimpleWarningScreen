package com.legionmodding.simplewarningscreen.handler;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.config.ModConfig;

public class ConfigurationHandler
{
    public static final String CATEGORY_CORE = "core";
    public static ForgeConfigSpec CLIENT_CONFIG;

    public static ForgeConfigSpec.BooleanValue ENABLE_SCREEN;
    public static ForgeConfigSpec.BooleanValue ESC_CLOSES;

    static
    {
        ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();

        CLIENT_BUILDER.comment("Core Settings").push(CATEGORY_CORE);
        setup(CLIENT_BUILDER);

        CLIENT_CONFIG = CLIENT_BUILDER.build();
    }


    public static void setup(ForgeConfigSpec.Builder CLIENT_BUILDER)
    {
        ENABLE_SCREEN = CLIENT_BUILDER.comment("Should the warning screen be enabled?").define("enableScreen", true);
        ESC_CLOSES = CLIENT_BUILDER.comment("Should the Esc key close the warning screen?").define("enableEsc", false);

        CLIENT_BUILDER.pop();
    }

    @SubscribeEvent
    public static void onLoad(final ModConfig.Loading event)
    {

    }

    @SubscribeEvent
    public static void onReload(final ModConfig.Reloading event)
    {

    }
}
