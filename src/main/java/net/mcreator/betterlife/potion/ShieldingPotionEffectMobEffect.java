
package net.mcreator.betterlife.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class ShieldingPotionEffectMobEffect extends MobEffect {
	public ShieldingPotionEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6283274);
	}

	@Override
	public String getDescriptionId() {
		return "effect.betterlife.shielding_potion_effect";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
