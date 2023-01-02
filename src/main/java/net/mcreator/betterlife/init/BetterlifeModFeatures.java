
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterlife.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.betterlife.world.features.plants.ContaminatedFlowerFeature;
import net.mcreator.betterlife.world.features.ores.DeepslateUraniumOreFeature;
import net.mcreator.betterlife.world.features.ores.ContaminatedSandFeature;
import net.mcreator.betterlife.world.features.UraniumPileSmallFeature;
import net.mcreator.betterlife.world.features.UraniumPile3Feature;
import net.mcreator.betterlife.world.features.UraniumPile2Feature;
import net.mcreator.betterlife.world.features.UraniumPile1Feature;
import net.mcreator.betterlife.world.features.UraniumMineSmallFeature;
import net.mcreator.betterlife.world.features.UraniumMineFeature;
import net.mcreator.betterlife.BetterlifeMod;

@Mod.EventBusSubscriber
public class BetterlifeModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, BetterlifeMod.MODID);
	public static final RegistryObject<Feature<?>> DEEPSLATE_URANIUM_ORE = REGISTRY.register("deepslate_uranium_ore",
			DeepslateUraniumOreFeature::feature);
	public static final RegistryObject<Feature<?>> CONTAMINATED_SAND = REGISTRY.register("contaminated_sand", ContaminatedSandFeature::feature);
	public static final RegistryObject<Feature<?>> CONTAMINATED_FLOWER = REGISTRY.register("contaminated_flower", ContaminatedFlowerFeature::feature);
	public static final RegistryObject<Feature<?>> URANIUM_MINE = REGISTRY.register("uranium_mine", UraniumMineFeature::feature);
	public static final RegistryObject<Feature<?>> URANIUM_MINE_SMALL = REGISTRY.register("uranium_mine_small", UraniumMineSmallFeature::feature);
	public static final RegistryObject<Feature<?>> URANIUM_PILE_1 = REGISTRY.register("uranium_pile_1", UraniumPile1Feature::feature);
	public static final RegistryObject<Feature<?>> URANIUM_PILE_2 = REGISTRY.register("uranium_pile_2", UraniumPile2Feature::feature);
	public static final RegistryObject<Feature<?>> URANIUM_PILE_3 = REGISTRY.register("uranium_pile_3", UraniumPile3Feature::feature);
	public static final RegistryObject<Feature<?>> URANIUM_PILE_SMALL = REGISTRY.register("uranium_pile_small", UraniumPileSmallFeature::feature);
}
