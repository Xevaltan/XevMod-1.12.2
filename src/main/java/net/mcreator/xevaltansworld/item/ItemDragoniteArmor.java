
package net.mcreator.xevaltansworld.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.xevaltansworld.procedure.ProcedureDragoniteArmorLeggingsTickEvent;
import net.mcreator.xevaltansworld.procedure.ProcedureDragoniteArmorHelmetTickEvent;
import net.mcreator.xevaltansworld.procedure.ProcedureDragoniteArmorBootsTickEvent;
import net.mcreator.xevaltansworld.procedure.ProcedureDragoniteArmorBodyTickEvent;
import net.mcreator.xevaltansworld.creativetab.TabXevaltansWorld;
import net.mcreator.xevaltansworld.ElementsXevaltansWorld;

@ElementsXevaltansWorld.ModElement.Tag
public class ItemDragoniteArmor extends ElementsXevaltansWorld.ModElement {
	@GameRegistry.ObjectHolder("xevaltansworld:dragonitearmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("xevaltansworld:dragonitearmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("xevaltansworld:dragonitearmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("xevaltansworld:dragonitearmorboots")
	public static final Item boots = null;
	public ItemDragoniteArmor(ElementsXevaltansWorld instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("DRAGONITEARMOR", "xevaltansworld:ragonite_rmor", 41, new int[]{2, 5, 6, 2}, 10,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("block.anvil.fall")), 1.5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				super.onArmorTick(world, entity, itemstack);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureDragoniteArmorHelmetTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("dragonitearmorhelmet").setRegistryName("dragonitearmorhelmet").setCreativeTab(TabXevaltansWorld.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureDragoniteArmorBodyTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("dragonitearmorbody").setRegistryName("dragonitearmorbody").setCreativeTab(TabXevaltansWorld.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureDragoniteArmorLeggingsTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("dragonitearmorlegs").setRegistryName("dragonitearmorlegs").setCreativeTab(TabXevaltansWorld.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureDragoniteArmorBootsTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("dragonitearmorboots").setRegistryName("dragonitearmorboots").setCreativeTab(TabXevaltansWorld.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("xevaltansworld:dragonitearmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("xevaltansworld:dragonitearmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("xevaltansworld:dragonitearmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("xevaltansworld:dragonitearmorboots", "inventory"));
	}
}
