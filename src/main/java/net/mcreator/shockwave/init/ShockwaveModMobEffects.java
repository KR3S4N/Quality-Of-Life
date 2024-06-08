
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shockwave.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.shockwave.potion.InstantGrowthMobEffect;
import net.mcreator.shockwave.ShockwaveMod;

public class ShockwaveModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ShockwaveMod.MODID);
	public static final RegistryObject<MobEffect> INSTANT_GROWTH = REGISTRY.register("instant_growth", () -> new InstantGrowthMobEffect());
}
