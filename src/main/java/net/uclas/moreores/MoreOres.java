package net.uclas.moreores;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import net.uclas.moreores.item.ModItemGroups;
import net.uclas.moreores.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.fabricmc.loader.impl.FabricLoaderImpl.MOD_ID;

public class MoreOres implements ModInitializer {
	public static final String MOD_ID = "moreores";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}
