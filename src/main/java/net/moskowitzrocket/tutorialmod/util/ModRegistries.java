package net.moskowitzrocket.tutorialmod.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.moskowitzrocket.tutorialmod.TutorialMod;
import net.moskowitzrocket.tutorialmod.item.ModItems;

public class ModRegistries {

    public static void registerModStuffs(){

       registerFuels();

    }

    private static void registerFuels(){

        TutorialMod.LOGGER.info("Registering Fuels for " + TutorialMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.GENERIC_FUEL_ITEM, 200);
    }

}
