
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.betterlife.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BetterlifeModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 13),

				new ItemStack(BetterlifeModItems.URANIUM_NUGGET.get()), 5, 5, 0.05f));
	}

	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			event.getTrades().get(5)
					.add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(BetterlifeModItems.ENRICHED_NETHERITE.get()),
							new ItemStack(BetterlifeModItems.ENRICHED_NETHERITE_PICKAXE.get()), 2, 15, 0.05f));
		}
	}
}
