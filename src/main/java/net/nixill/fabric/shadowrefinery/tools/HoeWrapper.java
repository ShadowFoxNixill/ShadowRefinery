package net.nixill.fabric.shadowrefinery.tools;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class HoeWrapper extends HoeItem {
	public HoeWrapper(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
		super(material, attackDamage, attackSpeed, settings);
	}
}
