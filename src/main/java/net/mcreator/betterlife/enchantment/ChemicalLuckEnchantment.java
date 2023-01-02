
package net.mcreator.betterlife.enchantment;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.betterlife.init.BetterlifeModItems;

import java.util.List;

public class ChemicalLuckEnchantment extends Enchantment {
	public ChemicalLuckEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return !List.of(Enchantments.BLOCK_FORTUNE, Enchantments.BLOCK_EFFICIENCY, Enchantments.UNBREAKING).contains(ench);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		Item item = stack.getItem();
		return List.of(BetterlifeModItems.WOODEN_GRIPPER.get(), BetterlifeModItems.IRON_GRIPPER.get()).contains(item);
	}
}
