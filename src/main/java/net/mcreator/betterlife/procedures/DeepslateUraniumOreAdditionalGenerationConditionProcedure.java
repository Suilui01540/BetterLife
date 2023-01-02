package net.mcreator.betterlife.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.betterlife.init.BetterlifeModBlocks;

public class DeepslateUraniumOreAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBiome(new BlockPos(x, y + 120, z)).is(new ResourceLocation("betterlife:scree_desert"))) {
			if (!world.isEmptyBlock(new BlockPos(x, y + 1, z))) {
				world.setBlock(new BlockPos(x, y, z), BetterlifeModBlocks.DEEPSLATE_URANIUM_ORE.get().defaultBlockState(), 3);
			} else if (!world.isEmptyBlock(new BlockPos(x, y - 1, z))) {
				world.setBlock(new BlockPos(x, y, z), BetterlifeModBlocks.DEEPSLATE_URANIUM_ORE.get().defaultBlockState(), 3);
			}
		}
		return true;
	}
}
