
package net.mcreator.xevaltansworld.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.xevaltansworld.item.ItemDragoniteFlowerPower;
import net.mcreator.xevaltansworld.block.BlockDragoniteFlower;
import net.mcreator.xevaltansworld.ElementsXevaltansWorld;

@ElementsXevaltansWorld.ModElement.Tag
public class RecipeSmeltDragoniteFlower extends ElementsXevaltansWorld.ModElement {
	public RecipeSmeltDragoniteFlower(ElementsXevaltansWorld instance) {
		super(instance, 39);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockDragoniteFlower.block, (int) (1)), new ItemStack(ItemDragoniteFlowerPower.block, (int) (1)), 1F);
	}
}
