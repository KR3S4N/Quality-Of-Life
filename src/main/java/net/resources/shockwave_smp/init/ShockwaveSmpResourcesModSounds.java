
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.resources.shockwave_smp.init;

import net.resources.shockwave_smp.ShockwaveSmpResourcesMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class ShockwaveSmpResourcesModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ShockwaveSmpResourcesMod.MODID);
	public static final RegistryObject<SoundEvent> ATTACK_PARRY = REGISTRY.register("attack.parry", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("shockwave_smp_resources", "attack.parry")));
}
