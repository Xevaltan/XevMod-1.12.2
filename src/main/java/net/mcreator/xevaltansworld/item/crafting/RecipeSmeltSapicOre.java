
package net.mcreator.xevaltansworld.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.xevaltansworld.item.ItemPiecedeSapicImpure;
import net.mcreator.xevaltansworld.block.BlockMineraideSapic;
import net.mcreator.xevaltansworld.ElementsXevaltansWorld;

@ElementsXevaltansWorld.ModElement.Tag
public class RecipeSmeltSapicOre extends ElementsXevaltansWorld.ModElement {
	public RecipeSmeltSapicOre(ElementsXevaltansWorld instance) {
		super(instance, 10);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockMineraideSapic.block, (int) (1)), new ItemStack(ItemPiecedeSapicImpure.block, (int) (1)), 1F);
	}
}
