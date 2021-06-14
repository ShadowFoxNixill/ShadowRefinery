package net.nixill.fabric.shadowrefinery;

import java.util.LinkedHashMap;
import java.util.Map;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ShadowRefineryBlocks {
	private static final Map<Identifier, Block> BLOCKS = new LinkedHashMap<>();

	public static final Block ROSE_GOLD_BLOCK = add("rose_gold_block", new Block(FabricBlockSettings.of(Material.METAL, MapColor.PINK).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.METAL)));

	private static <I extends Block> I add(String name, I block) {
		BLOCKS.put(new Identifier("shadow_refinery", name), block);
		return block;
	}

	public static void registerBlocks() {
		for (Identifier id : BLOCKS.keySet()) {
			Registry.register(Registry.BLOCK, id, BLOCKS.get(id));
		}
	}
}
