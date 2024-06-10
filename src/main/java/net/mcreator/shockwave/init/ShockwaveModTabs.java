
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shockwave.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.shockwave.ShockwaveMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ShockwaveModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ShockwaveMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(ShockwaveModItems.WOODEN_SCYTHE.get());
			tabData.accept(ShockwaveModItems.STONE_SCYTHE.get());
			tabData.accept(ShockwaveModItems.IRON_SCYTHE.get());
			tabData.accept(ShockwaveModItems.GOLD_SCYTHE.get());
			tabData.accept(ShockwaveModItems.DIAMOND_SCYTHE.get());
			tabData.accept(ShockwaveModItems.NETHERITE_SCYTHE.get());
		}
	}
}
