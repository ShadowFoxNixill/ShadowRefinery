package net.nixill.fabric.shadowrefinery;

import java.util.LinkedHashMap;
import java.util.Map;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
//import net.minecraft.item.FoodComponent;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nixill.fabric.shadowrefinery.armor.*;
import net.nixill.fabric.shadowrefinery.tools.*;

public class ShadowRefineryItems {
  private static final Map<Identifier, Item> ITEMS = new LinkedHashMap<>();

  public static final ArmorMaterial ROSE_GOLD_ARMOR = new RoseGoldArmorMaterial();
  public static final ToolMaterial ROSE_GOLD_TOOL = new RoseGoldToolMaterial();
  public static final Item ROSE_GOLD_INGOT = add("rose_gold_ingot", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
  public static final Item ROSE_GOLD_SWORD = add("rose_gold_sword", new SwordItem(ROSE_GOLD_TOOL, 3, -2.4f, new Item.Settings().group(ItemGroup.COMBAT)));
  public static final Item ROSE_GOLD_SHOVEL = add("rose_gold_shovel", new ShovelItem(ROSE_GOLD_TOOL, 1.5f, -3f, new Item.Settings().group(ItemGroup.TOOLS)));
  public static final Item ROSE_GOLD_PICKAXE = add("rose_gold_pickaxe", new PickaxeWrapper(ROSE_GOLD_TOOL, 1, -2.8f, new Item.Settings().group(ItemGroup.TOOLS)));
  public static final Item ROSE_GOLD_AXE = add("rose_gold_axe", new AxeWrapper(ROSE_GOLD_TOOL, 6f, -3f, new Item.Settings().group(ItemGroup.TOOLS)));
  public static final Item ROSE_GOLD_HOE = add("rose_gold_hoe", new HoeWrapper(ROSE_GOLD_TOOL, -2, -1f, new Item.Settings().group(ItemGroup.TOOLS)));
  public static final Item ROSE_GOLD_HELMET = add("rose_gold_helmet", new ArmorItem(ROSE_GOLD_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT)));
  public static final Item ROSE_GOLD_CHESTPLATE = add("rose_gold_chestplate", new ArmorItem(ROSE_GOLD_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));
  public static final Item ROSE_GOLD_LEGGINGS = add("rose_gold_leggings", new ArmorItem(ROSE_GOLD_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT)));
  public static final Item ROSE_GOLD_BOOTS = add("rose_gold_boots", new ArmorItem(ROSE_GOLD_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT)));

  private static <I extends Item> I add(String name, I item) {
    ITEMS.put(new Identifier("shadow_refinery", name), item);
    return item;
  }

  public static void registerItems() {
    for (Identifier id : ITEMS.keySet()) {
      Registry.register(Registry.ITEM, id, ITEMS.get(id));
    }
  }
}
