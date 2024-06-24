package net.resources.shockwave_smp.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class TooltipRenderingProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onItemTooltip(ItemTooltipEvent event) {
		execute(event, event.getItemStack(), event.getToolTip());
	}

	public static void execute(ItemStack itemstack, List<Component> tooltip) {
		execute(null, itemstack, tooltip);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack, List<Component> tooltip) {
		if (tooltip == null)
			return;
		if (itemstack.is(ItemTags.create(new ResourceLocation("shockwave_smp_resources:reforgable")))) {
			if (!(itemstack.getOrCreateTag().getString("Reforge")).isEmpty()) {
				tooltip.add(1, Component.literal(("\u00A77[\u00A76" + (Component.translatable(("reforge.icon." + itemstack.getOrCreateTag().getString("Reforge"))).getString() + "\u00A77]"))));
			} else {
				tooltip.add(1, Component.literal("\u00A78[\u00A77\u2592\u00A78]"));
			}
		}
		if (itemstack.is(ItemTags.create(new ResourceLocation("shockwave_smp_resources:special")))) {
			tooltip.add(Component.literal("\u00A7c\u00A7l\uA731\u1D18\u1D07\u1D04\u0131\u1D00\u029F"));
		} else if (itemstack.is(ItemTags.create(new ResourceLocation("shockwave_smp_resources:exotic")))) {
			tooltip.add(Component.literal("\u00A76\u00A7l\u1D07x\u1D0F\u1D1B\u0131\u1D04"));
		} else if (itemstack.is(ItemTags.create(new ResourceLocation("shockwave_smp_resources:legendary")))) {
			tooltip.add(Component.literal("\u00A7d\u00A7l\u029F\u1D07\u0262\u1D07\u0274\u1D05\u1D00\u0280\u028F"));
		} else if (itemstack.is(ItemTags.create(new ResourceLocation("shockwave_smp_resources:a_normal_rarity")))) {
			tooltip.add(Component.literal("\u00A79\u00A7l\u0280\u1D00\u0280\u1D07"));
		} else if (itemstack.is(ItemTags.create(new ResourceLocation("shockwave_smp_resources:epic")))) {
			tooltip.add(Component.literal("\u00A75\u00A7l\u1D07\u1D18\u0131\u1D04"));
		} else if (itemstack.is(ItemTags.create(new ResourceLocation("shockwave_smp_resources:uncommon")))) {
			tooltip.add(Component.literal("\u00A7a\u00A7l\u1D1C\u0274\u1D04\u1D0F\u1D0D\u1D0D\u1D0F\u0274"));
		} else {
			tooltip.add(Component.literal("\u00A77\u00A7l\u1D04\u1D0F\u1D0D\u1D0D\u1D0F\u0274"));
		}
	}
}
