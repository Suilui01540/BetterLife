
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterlife.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.betterlife.world.inventory.EnrichedBrewingMenu;
import net.mcreator.betterlife.BetterlifeMod;

public class BetterlifeModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, BetterlifeMod.MODID);
	public static final RegistryObject<MenuType<EnrichedBrewingMenu>> ENRICHED_BREWING = REGISTRY.register("enriched_brewing",
			() -> IForgeMenuType.create(EnrichedBrewingMenu::new));
}
