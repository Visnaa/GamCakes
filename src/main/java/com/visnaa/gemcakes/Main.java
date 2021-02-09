package com.visnaa.gemcakes;

import com.visnaa.gemcakes.init.ModBlocks;
import com.visnaa.gemcakes.init.ModItems;
import com.visnaa.gemcakes.tabs.GemCakesTab;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("gemcakes")
public class Main
{
    private static final Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "gemcakes";
    public static final ItemGroup ITEM_GROUP = new GemCakesTab();

    public Main() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        
        ModItems.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }
}
