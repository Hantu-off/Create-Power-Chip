package xyz.amycute.powerchip.registry;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import xyz.amycute.powerchip.PowerChips;

public class ModItems
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PowerChips.MOD_ID);
    public static final DeferredHolder<Item, Item> CHIP_CASING = ITEMS.registerSimpleItem("chip_casing", new Item.Properties());
    public static final DeferredHolder<Item, Item> CHIP = ITEMS.registerSimpleItem("chip", new Item.Properties());
}
