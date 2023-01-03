package net.mcreator.betterlife.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.betterlife.init.BetterlifeModMobEffects;

public class IodinePillPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(BetterlifeModMobEffects.SHIELDING_POTION_EFFECT.get())
				? _livEnt.getEffect(BetterlifeModMobEffects.SHIELDING_POTION_EFFECT.get()).getDuration()
				: 0) < 2000) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(BetterlifeModMobEffects.SHIELDING_POTION_EFFECT.get(),
						(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(BetterlifeModMobEffects.SHIELDING_POTION_EFFECT.get())
								? _livEnt.getEffect(BetterlifeModMobEffects.SHIELDING_POTION_EFFECT.get()).getDuration()
								: 0) + 400),
						0));
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(BetterlifeModMobEffects.SHIELDING_POTION_EFFECT.get(), 2400, 0));
		}
	}
}
