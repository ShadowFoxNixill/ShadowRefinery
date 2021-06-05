package net.nixill.fabric.shadowrefinery.tools;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class AxeWrapper extends AxeItem {
	public AxeWrapper(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
		super(material, attackDamage, attackSpeed, settings);
	}
}
