package net.turbsi.mccourse.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.turbsi.mccourse.MCCourseMod;

public class ModBlocks {

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block RAW_RUBY_BLOCK = registerBlock("raw_ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));

    //Assignment Blocks -START-
            public static final Block RUBY_ORE = registerBlock("ruby_ore",
                    new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));

            public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
                    new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));

            public static final Block NETHER_RUBY_ORE = registerBlock("nether_ruby_ore",
                    new Block(FabricBlockSettings.copyOf(Blocks.NETHER_GOLD_ORE)));

            public static final Block END_RUBY_ORE = registerBlock("end_ruby_ore",
                    new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    //Assignment Blocks -END-

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MCCourseMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(MCCourseMod.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        MCCourseMod.LOGGER.info("Registering Mod Block for " + MCCourseMod.MOD_ID);
    }
}
