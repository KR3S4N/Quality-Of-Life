
package net.mcreator.shockwave.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.shockwave.procedures.InstantGrowthEffectStartedappliedProcedure;

public class InstantGrowthMobEffect extends MobEffect {
	public InstantGrowthMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -1);
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		InstantGrowthEffectStartedappliedProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
