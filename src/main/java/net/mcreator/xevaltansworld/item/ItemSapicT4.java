
package net.mcreator.xevaltansworld.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.xevaltansworld.creativetab.TabXevaltansWorld;
import net.mcreator.xevaltansworld.ElementsXevaltansWorld;

@ElementsXevaltansWorld.ModElement.Tag
public class ItemSapicT4 extends ElementsXevaltansWorld.ModElement {
	@GameRegistry.ObjectHolder("xevaltansworld:sapict4")
	public static final Item block = null;
	public ItemSapicT4(ElementsXevaltansWorld instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("xevaltansworld:sapict4", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("sapict4");
			setRegistryName("sapict4");
			setCreativeTab(TabXevaltansWorld.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}
	}
}
