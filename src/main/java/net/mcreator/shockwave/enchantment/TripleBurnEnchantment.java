
package net.mcreator.shockwave.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.shockwave.init.ShockwaveModItems;

public class TripleBurnEnchantment extends Enchantment {
	public TripleBurnEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack itemstack) {
		return Ingredient.of(new ItemStack(ShockwaveModItems.FLAMETHOWER.get())).test(itemstack);
	}

	@Override
	public boolean isTreasureOnly() {
		return true;
	}
}
