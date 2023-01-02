
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterlife.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.betterlife.enchantment.LongevityEnchantment;
import net.mcreator.betterlife.enchantment.ChemicalLuckEnchantment;
import net.mcreator.betterlife.BetterlifeMod;

public class BetterlifeModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, BetterlifeMod.MODID);
	public static final RegistryObject<Enchantment> CHEMICAL_LUCK = REGISTRY.register("chemical_luck", () -> new ChemicalLuckEnchantment());
	public static final RegistryObject<Enchantment> LONGEVITY = REGISTRY.register("longevity", () -> new LongevityEnchantment());
}
