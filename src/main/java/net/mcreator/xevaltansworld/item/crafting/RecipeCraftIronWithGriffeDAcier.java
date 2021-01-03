
package net.mcreator.xevaltansworld.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.xevaltansworld.item.ItemGriffeDAcier;
import net.mcreator.xevaltansworld.ElementsXevaltansWorld;

@ElementsXevaltansWorld.ModElement.Tag
public class RecipeCraftIronWithGriffeDAcier extends ElementsXevaltansWorld.ModElement {
	public RecipeCraftIronWithGriffeDAcier(ElementsXevaltansWorld instance) {
		super(instance, 8);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemGriffeDAcier.block, (int) (1)), new ItemStack(Items.IRON_INGOT, (int) (7)), 1F);
	}
}
