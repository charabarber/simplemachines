package catastrophyte.simplemachines.item;

import catastrophyte.simplemachines.SimpleMachines;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.ItemGroup;

public class ModItems {

    public static final Item IRON_DUST = registerItem("iron_dust",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item COPPER_DUST = registerItem("copper_dust",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item GOLD_DUST = registerItem("gold_dust",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item POWDERED_COAL= registerItem("powdered_coal",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item POWDERED_LAPIS = registerItem("powdered_lapis",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item POWDERED_DIAMOND = registerItem("powdered_diamond",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item POWDERED_EMERALD = registerItem("powdered_emerald",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(SimpleMachines.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SimpleMachines.LOGGER.debug("Registering items for " + SimpleMachines.MOD_ID);
    }
}
