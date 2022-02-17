package net.penrose.realmofpenrose;

import net.fabricmc.api.ModInitializer;
import net.penrose.realmofpenrose.block.ModBlocks;
import net.penrose.realmofpenrose.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RealmofPenrose implements ModInitializer {
	public static final String MOD_ID = "realmofpenrose";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlock();
		ModItems.registerModItems();
	}
}
