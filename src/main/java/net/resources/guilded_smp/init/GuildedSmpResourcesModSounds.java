
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.resources.guilded_smp.init;

import net.resources.guilded_smp.GuildedSmpResourcesMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class GuildedSmpResourcesModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, GuildedSmpResourcesMod.MODID);
	public static final RegistryObject<SoundEvent> ATTACK_PARRY = REGISTRY.register("attack.parry", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("guilded_smp_resources", "attack.parry")));
}
