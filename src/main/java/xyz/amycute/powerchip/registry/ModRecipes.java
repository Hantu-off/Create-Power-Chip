package xyz.amycute.powerchip.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import xyz.amycute.powerchip.PowerChips;
import xyz.amycute.powerchip.recipe.ChipCasingRecipe;

public class ModRecipes
{
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(Registries.RECIPE_SERIALIZER, PowerChips.MOD_ID);
    public static final DeferredRegister<RecipeType<?>> TYPES = DeferredRegister.create(Registries.RECIPE_TYPE, PowerChips.MOD_ID);
    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<ChipCasingRecipe>> CHIP_CASING_SERIALIZER = SERIALIZERS.register("chip_casing", ChipCasingRecipe.Serializer::new);
    public static final DeferredHolder<RecipeType<?>, RecipeType<ChipCasingRecipe>> CHIP_CASING_TYPE = TYPES.register("chip_casing", () -> new RecipeType<>() { @Override public String toString() { return PowerChips.MOD_ID + ":chip_casing"; }});
}
