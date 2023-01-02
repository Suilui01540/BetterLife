
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterlife.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.betterlife.BetterlifeMod;

public class BetterlifeModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, BetterlifeMod.MODID);
	public static final RegistryObject<Potion> RADIOACTIVE_DECAY_POTION = REGISTRY.register("radioactive_decay_potion",
			() -> new Potion(new MobEffectInstance(BetterlifeModMobEffects.RADIOACTIVE_DECAY.get(), 600, 0, false, true)));
	public static final RegistryObject<Potion> SHIELDING_POTION = REGISTRY.register("shielding_potion",
			() -> new Potion(new MobEffectInstance(BetterlifeModMobEffects.SHIELDING_POTION_EFFECT.get(), 900, 0, false, true)));
}
