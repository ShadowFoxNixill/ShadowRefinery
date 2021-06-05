package net.nixill.fabric.shadowrefinery.tools;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.nixill.fabric.shadowrefinery.ShadowRefineryItems;

// Rose gold tools are identical to iron tools
// in every way except enchantability and
// mining speed, which match gold's.

public class RoseGoldToolMaterial implements ToolMaterial {
	@Override
	public int getDurability() {
		return 750; // far higher than iron (250), but lower than diamond (1561)
	}

	@Override
	public float getMiningSpeedMultiplier() {
		return 12f; // gold
	}

	@Override
	public float getAttackDamage() {
		return 2f; // iron
	}

	@Override
	public int getMiningLevel() {
		return 2; // iron
	}

	@Override
	public int getEnchantability() {
		return 22; // gold
	}

	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(ShadowRefineryItems.ROSE_GOLD_INGOT);
	}
}
