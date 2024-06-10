
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shockwave.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.shockwave.item.WoodenScytheItem;
import net.mcreator.shockwave.item.StoneScytheItem;
import net.mcreator.shockwave.item.NetheriteScytheItem;
import net.mcreator.shockwave.item.IronScytheItem;
import net.mcreator.shockwave.item.GoldScytheItem;
import net.mcreator.shockwave.item.DiamondScytheItem;
import net.mcreator.shockwave.ShockwaveMod;

public class ShockwaveModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ShockwaveMod.MODID);
	public static final RegistryObject<Item> WOODEN_SCYTHE = REGISTRY.register("wooden_scythe", () -> new WoodenScytheItem());
	public static final RegistryObject<Item> STONE_SCYTHE = REGISTRY.register("stone_scythe", () -> new StoneScytheItem());
	public static final RegistryObject<Item> IRON_SCYTHE = REGISTRY.register("iron_scythe", () -> new IronScytheItem());
	public static final RegistryObject<Item> GOLD_SCYTHE = REGISTRY.register("gold_scythe", () -> new GoldScytheItem());
	public static final RegistryObject<Item> DIAMOND_SCYTHE = REGISTRY.register("diamond_scythe", () -> new DiamondScytheItem());
	public static final RegistryObject<Item> NETHERITE_SCYTHE = REGISTRY.register("netherite_scythe", () -> new NetheriteScytheItem());
	// Start of user code block custom items
	// End of user code block custom items
}
