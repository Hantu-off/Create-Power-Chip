package xyz.amycute.powerchip;

import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import org.patryk3211.powergrid.PowerGrid;
import org.patryk3211.powergrid.forge.PowerGridImpl;
import xyz.amycute.powerchip.registry.ModItems;

@Mod(PowerChips.MOD_ID)
public class PowerChips
{
    public static final String MOD_ID = "powerchip";

    public PowerChips(IEventBus modBus)
    {
        ModItems.ITEMS.register(modBus);
        modBus.addListener(this::addTab);
    }

    private void addTab(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey().location().equals(ResourceLocation.fromNamespaceAndPath("powergrid", "main")))
        {
            event.accept(ModItems.CHIP_CASING.get());
        }
    }
}