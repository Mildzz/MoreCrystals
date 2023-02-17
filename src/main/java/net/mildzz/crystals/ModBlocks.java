package net.mildzz.crystals;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.mildzz.MoreCrystals;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block CLEAR_QUARTZ = registerCrystal("clear_quartz",
            new Crystal(FabricBlockSettings.copy(Blocks.AMETHYST_CLUSTER)), ModItemGroup.CRYSTALS);
    public static final Block CLEAR_QUARTZ_TOWER = registerCrystal("clear_quartz_tower",
            new CrystalTower(FabricBlockSettings.copy(Blocks.AMETHYST_CLUSTER)), ModItemGroup.CRYSTALS);
    public static final Block CLEAR_QUARTZ_BUD = registerCrystal("clear_quartz_bud",
            new CrystalBud(FabricBlockSettings.copy(Blocks.AMETHYST_CLUSTER)), ModItemGroup.CRYSTALS);
    public static final Block ROSE_QUARTZ = registerCrystal("rose_quartz",
            new Crystal(FabricBlockSettings.copy(Blocks.AMETHYST_CLUSTER)), ModItemGroup.CRYSTALS);
    public static final Block ROSE_QUARTZ_TOWER = registerCrystal("rose_quartz_tower",
            new CrystalTower(FabricBlockSettings.copy(Blocks.AMETHYST_CLUSTER)), ModItemGroup.CRYSTALS);
    public static final Block ROSE_QUARTZ_BUD = registerCrystal("rose_quartz_bud",
            new CrystalBud(FabricBlockSettings.copy(Blocks.AMETHYST_CLUSTER)), ModItemGroup.CRYSTALS);
    public static final Block OBSIDIAN = registerCrystal("obsidian",
            new Crystal(FabricBlockSettings.copy(Blocks.AMETHYST_CLUSTER)), ModItemGroup.CRYSTALS);
    public static final Block OBSIDIAN_TOWER = registerCrystal("obsidian_tower",
            new CrystalTower(FabricBlockSettings.copy(Blocks.AMETHYST_CLUSTER)), ModItemGroup.CRYSTALS);
    public static final Block OBSIDIAN_BUD = registerCrystal("obsidian_bud",
            new CrystalBud(FabricBlockSettings.copy(Blocks.AMETHYST_CLUSTER)), ModItemGroup.CRYSTALS);
    public static final Block BLUE_FLOURITE = registerCrystal("blue_flourite",
            new Crystal(FabricBlockSettings.copy(Blocks.AMETHYST_CLUSTER)), ModItemGroup.CRYSTALS);
    public static final Block BLUE_FLOURITE_TOWER = registerCrystal("blue_flourite_tower",
            new CrystalTower(FabricBlockSettings.copy(Blocks.AMETHYST_CLUSTER)), ModItemGroup.CRYSTALS);
    public static final Block BLUE_FLOURITE_BUD = registerCrystal("blue_flourite_bud",
            new CrystalBud(FabricBlockSettings.copy(Blocks.AMETHYST_CLUSTER)), ModItemGroup.CRYSTALS);
    public static final Block GREEN_CITRINE = registerCrystal("green_citrine",
            new Crystal(FabricBlockSettings.copy(Blocks.AMETHYST_CLUSTER)), ModItemGroup.CRYSTALS);
    public static final Block GREEN_CITRINE_TOWER = registerCrystal("green_citrine_tower",
            new CrystalTower(FabricBlockSettings.copy(Blocks.AMETHYST_CLUSTER)), ModItemGroup.CRYSTALS);
    public static final Block GREEN_CITRINE_BUD = registerCrystal("green_citrine_bud",
            new CrystalBud(FabricBlockSettings.copy(Blocks.AMETHYST_CLUSTER)), ModItemGroup.CRYSTALS);
    public static final Block OPALITE = registerCrystal("opalite",
            new Crystal(FabricBlockSettings.copy(Blocks.AMETHYST_CLUSTER)), ModItemGroup.CRYSTALS);
    public static final Block OPALITE_TOWER = registerCrystal("opalite_tower",
            new CrystalTower(FabricBlockSettings.copy(Blocks.AMETHYST_CLUSTER)), ModItemGroup.CRYSTALS);
    public static final Block OPALITE_BUD = registerCrystal("opalite_bud",
            new CrystalBud(FabricBlockSettings.copy(Blocks.AMETHYST_CLUSTER)), ModItemGroup.CRYSTALS);

    private static Block registerCrystal(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(MoreCrystals.MOD_ID, name), block);

    }
    private static void registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(MoreCrystals.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModBlocks() {
        MoreCrystals.LOGGER.info("Registering Crystals for More Crystals!");
    }

}
