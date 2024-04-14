package catastrophyte.simplemachines;

import catastrophyte.simplemachines.block.ModBlocks;
import catastrophyte.simplemachines.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleMachines implements ModInitializer {
	public static final java.lang.String MOD_ID = "SimpleMachines";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}