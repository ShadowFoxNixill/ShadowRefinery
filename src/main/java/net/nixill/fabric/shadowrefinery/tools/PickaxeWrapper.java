package net.nixill.fabric.shadowrefinery.tools;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class PickaxeWrapper extends PickaxeItem {
	public PickaxeWrapper(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
		super(material, attackDamage, attackSpeed, settings);
	}
}
