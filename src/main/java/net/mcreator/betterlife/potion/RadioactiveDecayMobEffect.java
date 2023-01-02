
package net.mcreator.betterlife.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.betterlife.procedures.RadioactiveDecayOnEffectActiveTickProcedure;

public class RadioactiveDecayMobEffect extends MobEffect {
	public RadioactiveDecayMobEffect() {
		super(MobEffectCategory.HARMFUL, -256);
	}

	@Override
	public String getDescriptionId() {
		return "effect.betterlife.radioactive_decay";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		RadioactiveDecayOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
