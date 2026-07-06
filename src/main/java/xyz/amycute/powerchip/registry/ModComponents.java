package xyz.amycute.powerchip.registry;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.registries.RegisterEvent;
import org.patryk3211.powergrid.circuits.components.ComponentRegistry;
import org.patryk3211.powergrid.circuits.schematic.ComponentFootprint;
import xyz.amycute.powerchip.PowerChips;
import xyz.amycute.powerchip.component.ChipComponent;
import xyz.amycute.powerchip.component.IOPinComponent;

@EventBusSubscriber(modid = PowerChips.MOD_ID)
public class ModComponents
{
    public static final ChipComponent CHIP_COMPONENT = buildChipComponent();
    public static final IOPinComponent IO_PIN_COMPONENT = buildIOPinComponent();

    private static ChipComponent buildChipComponent()
    {
        var footprint = new ComponentFootprint.Builder(4, 2, "component." + PowerChips.MOD_ID + ".chip", null)
            .addPad(0, 0, 0, "PIN 1", "1")
            .addPad(1, 0, 1, "PIN 2", "2")
            .addPad(2, 0, 2, "PIN 3", "3")
            .addPad(3, 0, 3, "PIN 4", "4")
            .addPad(0, 1, 4, "PIN 5", "5")
            .addPad(1, 1, 5, "PIN 6", "6")
            .addPad(2, 1, 6, "PIN 7", "7")
            .addPad(3, 1, 7, "PIN 8", "8")
            .withItem()
            .withOutline()
            .build();
        return new ChipComponent(footprint);
    }

    private static IOPinComponent buildIOPinComponent()
    {
        var footprint = new ComponentFootprint.Builder(1, 1, "component." + PowerChips.MOD_ID + ".io_pin", null)
            .addPad(0, 0, 0, "Pin", null)
            .withItem()
            .build();
        return new IOPinComponent(footprint);
    }

    @SubscribeEvent
    public static void onRegister(RegisterEvent event)
    {
        if (event.getRegistryKey().equals(ComponentRegistry.REGISTRY_KEY))
        {
            event.register(ComponentRegistry.REGISTRY_KEY, ResourceLocation.fromNamespaceAndPath(PowerChips.MOD_ID, "chip"), () -> CHIP_COMPONENT);
            event.register(ComponentRegistry.REGISTRY_KEY, ResourceLocation.fromNamespaceAndPath(PowerChips.MOD_ID, "io_pin"), () -> IO_PIN_COMPONENT);
        }
    }
}
