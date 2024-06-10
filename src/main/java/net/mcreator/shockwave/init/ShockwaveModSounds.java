
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shockwave.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.shockwave.ShockwaveMod;

public class ShockwaveModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ShockwaveMod.MODID);
	public static final RegistryObject<SoundEvent> ATTACK_PARRY = REGISTRY.register("attack.parry", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("shockwave", "attack.parry")));
}
