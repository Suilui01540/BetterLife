
package net.mcreator.betterlife.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.betterlife.procedures.UraniumNuggetItemInInventoryTickProcedure;
import net.mcreator.betterlife.procedures.UraniumItemIsDroppedByPlayerProcedure;

public class UraniumNuggetItem extends Item {
	public UraniumNuggetItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		UraniumNuggetItemInInventoryTickProcedure.execute(entity);
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		UraniumItemIsDroppedByPlayerProcedure.execute(entity);
		return true;
	}
}
