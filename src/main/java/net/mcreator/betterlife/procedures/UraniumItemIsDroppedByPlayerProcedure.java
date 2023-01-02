package net.mcreator.betterlife.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.betterlife.init.BetterlifeModMobEffects;

public class UraniumItemIsDroppedByPlayerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(BetterlifeModMobEffects.RADIOACTIVE_DECAY.get());
	}
}
