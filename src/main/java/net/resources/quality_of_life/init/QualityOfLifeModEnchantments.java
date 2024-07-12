
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.resources.quality_of_life.init;

import net.resources.quality_of_life.enchantment.VoidwrackerEnchantment;
import net.resources.quality_of_life.enchantment.HellsplitterEnchantment;
import net.resources.quality_of_life.enchantment.DeathripperEnchantment;
import net.resources.quality_of_life.QualityOfLifeMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

public class QualityOfLifeModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, QualityOfLifeMod.MODID);
	public static final RegistryObject<Enchantment> DEATHRIPPER = REGISTRY.register("deathripper", () -> new DeathripperEnchantment());
	public static final RegistryObject<Enchantment> VOIDWRACKER = REGISTRY.register("voidwracker", () -> new VoidwrackerEnchantment());
	public static final RegistryObject<Enchantment> HELLSPLITTER = REGISTRY.register("hellsplitter", () -> new HellsplitterEnchantment());
}
