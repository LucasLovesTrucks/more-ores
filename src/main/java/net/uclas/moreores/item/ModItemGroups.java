package net.uclas.moreores.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.uclas.moreores.MoreOres;

public class ModItemGroups {
    public static final ItemGroup MORE_ORES_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MoreOres.MOD_ID, "more_ores"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.more_ores"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);
                    }).build());

    public static void registerItemGroups() {
        MoreOres.LOGGER.info("Registering ItemGroups for " +MoreOres.MOD_ID);
    }
}
