package com.legionmodding.simplewarningscreen.evebts;

import com.legionmodding.simplewarningscreen.SimpleWarningScreen;
import com.legionmodding.simplewarningscreen.client.screen.WarningScreen;

import com.legionmodding.simplewarningscreen.handler.ConfigurationHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.MainMenuScreen;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE, modid = SimpleWarningScreen.ID, value = Dist.CLIENT)
public final class ClientEvents
{
    private static boolean warningShown = false;

    @SubscribeEvent
    public static void onScreenInit(GuiScreenEvent.InitGuiEvent.Post event)
    {
        if(event.getGui() instanceof MainMenuScreen && !warningShown && ConfigurationHandler.ENABLE_SCREEN.get())
        {
            warningShown = true;
            Minecraft.getInstance().setScreen(new WarningScreen(event.getGui()));
        }
    }
}
