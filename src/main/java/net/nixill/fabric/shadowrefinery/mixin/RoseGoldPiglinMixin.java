package net.nixill.fabric.shadowrefinery.mixin;

import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.nixill.fabric.shadowrefinery.ShadowRefineryItems;

import java.util.Iterator;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PiglinBrain.class)
public class RoseGoldPiglinMixin {

	@Inject(at = @At("HEAD"), method = "wearsGoldArmor(Lnet/minecraft/entity/LivingEntity;)Z", cancellable = true)
	private static void wearsRoseGoldArmor(LivingEntity entity, CallbackInfoReturnable<Boolean> info) {
		Iterable<ItemStack> armor = entity.getArmorItems();
		Iterator<ItemStack> iterator = armor.iterator();
		Item item;

		while (iterator.hasNext()) {
			ItemStack stack = iterator.next();
			item = stack.getItem();
			if (item instanceof ArmorItem && ((ArmorItem)item).getMaterial() == ShadowRefineryItems.ROSE_GOLD_ARMOR) {
				info.setReturnValue(true);
			}
		}
	}

	@Inject(at = @At("HEAD"), method = "acceptsForBarter(Lnet/minecraft/item/ItemStack;)Z", cancellable = true)
	private static void acceptForBarterRg(ItemStack stack, CallbackInfoReturnable<Boolean> info) {
		if (stack.isOf(ShadowRefineryItems.ROSE_GOLD_INGOT)) {
			info.setReturnValue(true);
		}
	}
}
