
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterlife.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.betterlife.item.WoodenGripperItem;
import net.mcreator.betterlife.item.UraniumNuggetItem;
import net.mcreator.betterlife.item.UraniumItem;
import net.mcreator.betterlife.item.UraniumFragmentItem;
import net.mcreator.betterlife.item.ShieldingArmorItem;
import net.mcreator.betterlife.item.IronGripperItem;
import net.mcreator.betterlife.item.EnrichedNetheritePickaxeItem;
import net.mcreator.betterlife.item.EnrichedNetheriteItem;
import net.mcreator.betterlife.item.EnrichedNetheriteAxeItem;
import net.mcreator.betterlife.item.EnrichedBlazePowderItem;
import net.mcreator.betterlife.BetterlifeMod;

public class BetterlifeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BetterlifeMod.MODID);
	public static final RegistryObject<Item> ENRICHED_BLAZE_POWDER = REGISTRY.register("enriched_blaze_powder", () -> new EnrichedBlazePowderItem());
	public static final RegistryObject<Item> URANIUM = REGISTRY.register("uranium", () -> new UraniumItem());
	public static final RegistryObject<Item> ENRICHED_NETHERITE = REGISTRY.register("enriched_netherite", () -> new EnrichedNetheriteItem());
	public static final RegistryObject<Item> URANIUM_NUGGET = REGISTRY.register("uranium_nugget", () -> new UraniumNuggetItem());
	public static final RegistryObject<Item> URANIUM_FRAGMENT = REGISTRY.register("uranium_fragment", () -> new UraniumFragmentItem());
	public static final RegistryObject<Item> DEEPSLATE_URANIUM_ORE = block(BetterlifeModBlocks.DEEPSLATE_URANIUM_ORE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DEEPSLATE_BIG_URANIUM_ORE = block(BetterlifeModBlocks.DEEPSLATE_BIG_URANIUM_ORE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CONTAMINATED_SAND = block(BetterlifeModBlocks.CONTAMINATED_SAND, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ENRICHED_NETHERITE_AXE = REGISTRY.register("enriched_netherite_axe",
			() -> new EnrichedNetheriteAxeItem());
	public static final RegistryObject<Item> ENRICHED_NETHERITE_PICKAXE = REGISTRY.register("enriched_netherite_pickaxe",
			() -> new EnrichedNetheritePickaxeItem());
	public static final RegistryObject<Item> WOODEN_GRIPPER = REGISTRY.register("wooden_gripper", () -> new WoodenGripperItem());
	public static final RegistryObject<Item> IRON_GRIPPER = REGISTRY.register("iron_gripper", () -> new IronGripperItem());
	public static final RegistryObject<Item> CONTAMINATED_FLOWER = block(BetterlifeModBlocks.CONTAMINATED_FLOWER, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SHIELDING_ARMOR_CHESTPLATE = REGISTRY.register("shielding_armor_chestplate",
			() -> new ShieldingArmorItem.Chestplate());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
