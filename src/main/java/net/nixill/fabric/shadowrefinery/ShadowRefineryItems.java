package net.nixill.fabric.shadowrefinery;

import java.util.LinkedHashMap;
import java.util.Map;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ShadowRefineryItems {
  private static final Map<Identifier, Item> ITEMS = new LinkedHashMap<>();

  public static final Item FLOUR = add("flour", new Item(new FabricItemSettings().group(ItemGroup.FOOD)));
  public static final Item DOUGH = add("dough", new Item(new FabricItemSettings().group(ItemGroup.FOOD)));
  public static final Item BREAD_SLICE = add("bread_slice", new Item(
      new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(1).snack().build())));
  public static final Item YEAST = add("yeast", new Item(new FabricItemSettings().group(ItemGroup.FOOD)));
  public static final Item CRUSH_STONE = add("crush_stone", new Item(new FabricItemSettings().group(ItemGroup.TOOLS)));

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
