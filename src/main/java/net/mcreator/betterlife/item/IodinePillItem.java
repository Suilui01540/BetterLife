
package net.mcreator.betterlife.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.betterlife.procedures.IodinePillPlayerFinishesUsingItemProcedure;

public class IodinePillItem extends Item {
	public IodinePillItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(16).rarity(Rarity.RARE)
				.food((new FoodProperties.Builder()).nutrition(3).saturationMod(0.7f).alwaysEat()

						.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		IodinePillPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}
