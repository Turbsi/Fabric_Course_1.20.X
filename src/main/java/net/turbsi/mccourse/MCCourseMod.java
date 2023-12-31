package net.turbsi.mccourse;

import net.fabricmc.api.ModInitializer;

import net.turbsi.mccourse.block.ModBlocks;
import net.turbsi.mccourse.item.ModItemGroup;
import net.turbsi.mccourse.item.ModItems;
import net.turbsi.mccourse.utils.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "mccourse";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuff();
	}
}