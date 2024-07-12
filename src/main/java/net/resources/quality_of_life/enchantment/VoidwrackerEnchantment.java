
package net.resources.quality_of_life.enchantment;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import java.util.List;

public class VoidwrackerEnchantment extends Enchantment {
	public VoidwrackerEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return List.of(Enchantments.MENDING, Enchantments.UNBREAKING).contains(ench);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack itemstack) {
		return Ingredient.of(new ItemStack(Items.GOLDEN_SWORD)).test(itemstack);
	}
}
