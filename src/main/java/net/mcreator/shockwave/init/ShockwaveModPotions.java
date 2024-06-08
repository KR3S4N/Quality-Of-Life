
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shockwave.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.shockwave.ShockwaveMod;

public class ShockwaveModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, ShockwaveMod.MODID);
	public static final RegistryObject<Potion> INSTANT_GROWTH_POTION = REGISTRY.register("instant_growth_potion", () -> new Potion(new MobEffectInstance(ShockwaveModMobEffects.INSTANT_GROWTH.get(), 1, 0, false, false)));
}
