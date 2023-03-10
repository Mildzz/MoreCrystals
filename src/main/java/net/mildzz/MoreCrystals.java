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
		Block clearQuartzTower = ModBlocks.CLEAR_QUARTZ_TOWER;
		Block clearQuartzBud = ModBlocks.CLEAR_QUARTZ_BUD;
		Block roseQuartz = ModBlocks.ROSE_QUARTZ;
		Block roseQuartzTower = ModBlocks.ROSE_QUARTZ_TOWER;
		Block roseQuartzBud = ModBlocks.ROSE_QUARTZ_BUD;
		Block obsidian = ModBlocks.OBSIDIAN;
		Block obsidianTower = ModBlocks.OBSIDIAN_TOWER;
		Block obsidianBud = ModBlocks.OBSIDIAN_BUD;
		Block blueFlourite = ModBlocks.BLUE_FLOURITE;
		Block blueFlouriteTower = ModBlocks.BLUE_FLOURITE_TOWER;
		Block blueFlouriteBud = ModBlocks.BLUE_FLOURITE_BUD;
		Block greenCitrine = ModBlocks.GREEN_CITRINE;
		Block greenCitrineTower = ModBlocks.GREEN_CITRINE_TOWER;
		Block greenCitrineBud = ModBlocks.GREEN_CITRINE_BUD;
		Block opalite = ModBlocks.OPALITE;
		Block opaliteTower = ModBlocks.OPALITE_TOWER;
		Block opaliteBud = ModBlocks.OPALITE_BUD;
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), opaliteBud, greenCitrineBud, blueFlouriteBud, obsidianBud, roseQuartzBud, clearQuartzBud, clearQuartz, obsidian, blueFlourite, greenCitrine, clearQuartzTower, blueFlouriteTower, obsidianTower, greenCitrineTower, opalite, opaliteTower, roseQuartz, roseQuartzTower);
	}
}