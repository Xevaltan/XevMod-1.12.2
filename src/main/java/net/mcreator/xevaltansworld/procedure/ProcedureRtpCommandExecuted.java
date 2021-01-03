package net.mcreator.xevaltansworld.procedure;

import net.minecraft.entity.Entity;

import net.mcreator.xevaltansworld.ElementsXevaltansWorld;

@ElementsXevaltansWorld.ModElement.Tag
public class ProcedureRtpCommandExecuted extends ElementsXevaltansWorld.ModElement {
	public ProcedureRtpCommandExecuted(ElementsXevaltansWorld instance) {
		super(instance, 12);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RtpCommandExecuted!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure RtpCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int y = (int) dependencies.get("y");
		entity.setPositionAndUpdate((Math.random() * 20000), y, (Math.random() * 20000));
	}
}
