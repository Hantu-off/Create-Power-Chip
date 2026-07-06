package xyz.amycute.powerchip;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import xyz.amycute.powerchip.registry.ModItems;
import xyz.amycute.powerchip.registry.ModRecipes;

@Mod(PowerChips.MOD_ID)
public class PowerChips
{
    public static final String MOD_ID = "powerchip";
    public static final String NBT_SCHEMATIC = "Schematic";
    public static final String NBT_NAME = "Name";

    public static final int MAX_IO = 8;

    public PowerChips(IEventBus modBus)
    {
        ModItems.ITEMS.register(modBus);
        ModRecipes.SERIALIZERS.register(modBus);
        ModRecipes.TYPES.register(modBus);
    }
}
