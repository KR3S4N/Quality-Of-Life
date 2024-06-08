package net.mcreator.shockwave.procedures;

import net.minecraft.world.entity.Entity;

public class FlamesProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setInvulnerable(false);
	}
}
