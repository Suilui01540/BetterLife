
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterlife.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.betterlife.block.DeepslateUraniumOreBlock;
import net.mcreator.betterlife.block.DeepslateBigUraniumOreBlock;
import net.mcreator.betterlife.block.ContaminatedSandBlock;
import net.mcreator.betterlife.block.ContaminatedFlowerBlock;
import net.mcreator.betterlife.BetterlifeMod;

public class BetterlifeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BetterlifeMod.MODID);
	public static final RegistryObject<Block> DEEPSLATE_URANIUM_ORE = REGISTRY.register("deepslate_uranium_ore",
			() -> new DeepslateUraniumOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_BIG_URANIUM_ORE = REGISTRY.register("deepslate_big_uranium_ore",
			() -> new DeepslateBigUraniumOreBlock());
	public static final RegistryObject<Block> CONTAMINATED_SAND = REGISTRY.register("contaminated_sand", () -> new ContaminatedSandBlock());
	public static final RegistryObject<Block> CONTAMINATED_FLOWER = REGISTRY.register("contaminated_flower", () -> new ContaminatedFlowerBlock());
}
