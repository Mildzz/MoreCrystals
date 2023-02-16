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
            new Block(FabricBlockSettings.copy(Blocks.AMETHYST_CLUSTER)), ModItemGroup.CRYSTALS);
    public static final Block OBSIDIAN = registerCrystal("obsidian",
            new Block(FabricBlockSettings.copy(Blocks.AMETHYST_CLUSTER)), ModItemGroup.CRYSTALS);

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
