package net.mcreator.betterlife.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.betterlife.network.BetterlifeModVariables;
import net.mcreator.betterlife.init.BetterlifeModMobEffects;

public class RadioactiveDecayOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(BetterlifeModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new BetterlifeModVariables.PlayerVariables())).ticks == 20) {
			if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(BetterlifeModMobEffects.SHIELDING_POTION_EFFECT.get()) : false)) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - 0.2));
			}
			{
				double _setval = 0;
				entity.getCapability(BetterlifeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ticks = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				double _setval = (entity.getCapability(BetterlifeModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BetterlifeModVariables.PlayerVariables())).ticks + 1;
				entity.getCapability(BetterlifeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ticks = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
