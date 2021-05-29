package net.nixill.fabric.shadowrefinery.armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.nixill.fabric.shadowrefinery.ShadowRefineryItems;

// Rose gold armor is identical to iron armor
// in every way except enchantability, which
// matches gold's.

public class RoseGoldArmorMaterial implements ArmorMaterial {
	private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
	private static final int[] PROTECTION_VALUES = new int[] {2, 5, 6, 2}; // iron

	@Override
	public int getDurability(EquipmentSlot slot) {
		return BASE_DURABILITY[slot.getEntitySlotId()] * 15; // iron
	}

	@Override
	public int getProtectionAmount(EquipmentSlot slot) {
		return PROTECTION_VALUES[slot.getEntitySlotId()];
	}

	@Override
	public int getEnchantability() {
		return 25; // gold
	}

	@Override
	public SoundEvent getEquipSound() {
		return SoundEvents.ITEM_ARMOR_EQUIP_GOLD;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(ShadowRefineryItems.ROSE_GOLD_INGOT);
	}

	@Override
	public String getName() {
		return "rose_gold";
	}

	@Override
	public float getToughness() {
		return 0f; // anything except diamond or netherite
	}

	@Override
	public float getKnockbackResistance() {
		return 0f;
	}
}
