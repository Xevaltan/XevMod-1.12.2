package net.mcreator.xevaltansworld.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.xevaltansworld.ElementsXevaltansWorld;

@ElementsXevaltansWorld.ModElement.Tag
public class ProcedureGriffeDAcierVenimeuxMobIsHitWithTool extends ElementsXevaltansWorld.ModElement {
	public ProcedureGriffeDAcierVenimeuxMobIsHitWithTool(ElementsXevaltansWorld instance) {
		super(instance, 14);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure GriffeDAcierVenimeuxMobIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.POISON, (int) 500, (int) 1));
	}
}
