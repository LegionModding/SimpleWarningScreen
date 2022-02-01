package com.legionmodding.simplewarningscreen;

import com.legionmodding.simplewarningscreen.handler.ConfigurationHandler;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(SimpleWarningScreen.ID)
public class SimpleWarningScreen
{
    public static final String ID = "simplewarningscreen";
    public static final Logger LOGGER = LogManager.getLogger();

    public SimpleWarningScreen()
    {
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, ConfigurationHandler.CLIENT_CONFIG);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onClientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onCommonSetup);;


        MinecraftForge.EVENT_BUS.register(this);
    }

    private void onClientSetup(FMLClientSetupEvent event)
    {

    }

    private void onCommonSetup(FMLCommonSetupEvent event)
    {

    }
}
