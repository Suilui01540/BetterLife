package net.mcreator.betterlife.procedures;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.betterlife.init.BetterlifeModEnchantments;

public class ContaminatedFlowerPlantDestroyedByPlayerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double chemicalLuckLevel = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.NETHERITE_HOE) {
			if (EnchantmentHelper.getItemEnchantmentLevel(BetterlifeModEnchantments.CHEMICAL_LUCK.get(),
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
				chemicalLuckLevel = EnchantmentHelper.getItemEnchantmentLevel(BetterlifeModEnchantments.CHEMICAL_LUCK.get(),
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
			}
		}
	}
}
