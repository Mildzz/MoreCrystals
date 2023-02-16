package net.mildzz.crystals;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mildzz.MoreCrystals;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup CRYSTALS;

    public static void registerItemGroups() {
        CRYSTALS = FabricItemGroup.builder(new Identifier(MoreCrystals.MOD_ID, "crystals"))
                .displayName(Text.translatable("itemgroup.crystals"))
                .icon(() -> new ItemStack(ModBlocks.CLEAR_QUARTZ)).build();
    }
}
