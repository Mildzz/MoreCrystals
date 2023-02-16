package net.mildzz;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.mildzz.crystals.ModBlocks;
import net.mildzz.crystals.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreCrystals implements ModInitializer {
	public static final String MOD_ID = "more-crystals";
	public static final Logger LOGGER = LoggerFactory.getLogger("more-crystals");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModBlocks.registerModBlocks();
		Block clearQuartz = ModBlocks.CLEAR_QUARTZ;
		Block obsidian = ModBlocks.OBSIDIAN;
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), clearQuartz, obsidian);
	}
}