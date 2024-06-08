
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shockwave.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.shockwave.item.FlamethowerItem;
import net.mcreator.shockwave.ShockwaveMod;

public class ShockwaveModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ShockwaveMod.MODID);
	public static final RegistryObject<Item> FLAMETHOWER = REGISTRY.register("flamethower", () -> new FlamethowerItem());
	// Start of user code block custom items
	// End of user code block custom items
}
