package net.mcreator.betterlife.procedures;

import net.minecraft.world.item.ItemStack;

public class UraniumExtensionFuelBurningSuccessConditionProcedure {
	public static boolean execute(ItemStack itemstack) {
		if (!itemstack.getItem().isEdible()) {
			return true;
		}
		return false;
	}
}
