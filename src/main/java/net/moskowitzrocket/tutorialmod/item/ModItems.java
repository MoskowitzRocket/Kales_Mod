package net.moskowitzrocket.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.moskowitzrocket.tutorialmod.TutorialMod;
import net.moskowitzrocket.tutorialmod.item.custom.DowsingRodItem;


public class ModItems {
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));

    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));

    public static final Item RAW_MYTHRIL = registerItem("raw_mythril",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));

    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroup.MYTHRIL).maxDamage(16)));

    public static final Item GENERIC_FUEL_ITEM = registerItem("generic_fuel_item",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));

    public static final Item PICKLE = registerItem("pickle",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL).food(ModFoodComponents.PICKLE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);
    }
}
