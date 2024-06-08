
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shockwave.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.shockwave.enchantment.TripleBurnEnchantment;
import net.mcreator.shockwave.enchantment.PyrotechEnchantment;
import net.mcreator.shockwave.enchantment.InfernumEnchantment;
import net.mcreator.shockwave.enchantment.AerialEnchantment;
import net.mcreator.shockwave.ShockwaveMod;

public class ShockwaveModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, ShockwaveMod.MODID);
	public static final RegistryObject<Enchantment> AERIAL = REGISTRY.register("aerial", () -> new AerialEnchantment());
	public static final RegistryObject<Enchantment> INFERNUM = REGISTRY.register("infernum", () -> new InfernumEnchantment());
	public static final RegistryObject<Enchantment> PYROTECH = REGISTRY.register("pyrotech", () -> new PyrotechEnchantment());
	public static final RegistryObject<Enchantment> TRIPLE_BURN = REGISTRY.register("triple_burn", () -> new TripleBurnEnchantment());
}
