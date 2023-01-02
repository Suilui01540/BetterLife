
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterlife.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.betterlife.potion.ShieldingPotionEffectMobEffect;
import net.mcreator.betterlife.potion.RadioactiveDecayMobEffect;
import net.mcreator.betterlife.BetterlifeMod;

public class BetterlifeModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, BetterlifeMod.MODID);
	public static final RegistryObject<MobEffect> RADIOACTIVE_DECAY = REGISTRY.register("radioactive_decay", () -> new RadioactiveDecayMobEffect());
	public static final RegistryObject<MobEffect> SHIELDING_POTION_EFFECT = REGISTRY.register("shielding_potion_effect",
			() -> new ShieldingPotionEffectMobEffect());
}
