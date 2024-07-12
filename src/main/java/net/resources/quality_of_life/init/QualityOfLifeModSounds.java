
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.resources.quality_of_life.init;

import net.resources.quality_of_life.QualityOfLifeMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class QualityOfLifeModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, QualityOfLifeMod.MODID);
	public static final RegistryObject<SoundEvent> PLAYER_ATTACK_ATTUNEMENTS_MATCH = REGISTRY.register("player.attack.attunements_match",
			() -> SoundEvent.createVariableRangeEvent(new ResourceLocation("quality_of_life", "player.attack.attunements_match")));
}
