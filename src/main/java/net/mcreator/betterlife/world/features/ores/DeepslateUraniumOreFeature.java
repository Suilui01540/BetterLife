
package net.mcreator.betterlife.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.BlockStateMatchTest;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Holder;

import net.mcreator.betterlife.init.BetterlifeModBlocks;

import java.util.Set;
import java.util.List;

public class DeepslateUraniumOreFeature extends OreFeature {
	public static DeepslateUraniumOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new DeepslateUraniumOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("betterlife:deepslate_uranium_ore", FEATURE,
				new OreConfiguration(List.of(
						OreConfiguration.target(new BlockStateMatchTest(Blocks.STONE.defaultBlockState()),
								BetterlifeModBlocks.DEEPSLATE_URANIUM_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.DEEPSLATE.defaultBlockState()),
								BetterlifeModBlocks.DEEPSLATE_URANIUM_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.STONE.defaultBlockState()),
								BetterlifeModBlocks.DEEPSLATE_URANIUM_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.DRIPSTONE_BLOCK.defaultBlockState()),
								BetterlifeModBlocks.DEEPSLATE_URANIUM_ORE.get().defaultBlockState())),
						6));
		PLACED_FEATURE = PlacementUtils.register("betterlife:deepslate_uranium_ore", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(9), InSquarePlacement.spread(),
						HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(76)), BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public DeepslateUraniumOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
