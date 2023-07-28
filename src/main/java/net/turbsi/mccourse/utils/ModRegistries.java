package net.turbsi.mccourse.utils;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.turbsi.mccourse.block.ModBlocks;
import net.turbsi.mccourse.item.ModItems;

public class ModRegistries {

    public static void registerModStuff(){
        registerFuels();
    }

    private static void registerFuels() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.PEAT_BRICK, 200);
        registry.add(ModBlocks.PEAT_BLOCK, 400);
    }
}
