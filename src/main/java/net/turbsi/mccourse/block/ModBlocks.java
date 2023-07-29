package net.turbsi.mccourse.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.turbsi.mccourse.MCCourseMod;
import net.turbsi.mccourse.block.custom.SoundBlock;

public class ModBlocks {

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block RAW_RUBY_BLOCK = registerBlock("raw_ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));

    //Assignment Blocks -START-
            public static final Block RUBY_ORE = registerBlock("ruby_ore",
                    new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));

            public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
                    new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));

            public static final Block NETHER_RUBY_ORE = registerBlock("nether_ruby_ore",
                    new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHER_GOLD_ORE)));

            public static final Block END_RUBY_ORE = registerBlock("end_ruby_ore",
                    new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    //Assignment Blocks -END-

    public static final Block SOUND_BLOCK = registerBlock("sound_block",
            new SoundBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block PEAT_BLOCK = registerBlock("peat_block",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block RUBY_STAIRS = registerBlock("ruby_stairs",
            new StairsBlock(ModBlocks.RUBY_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.RUBY_BLOCK)));
    public static final Block RUBY_SLAB = registerBlock("ruby_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.RUBY_BLOCK)));
   public static final Block RUBY_BUTTON = registerBlock("ruby_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.IRON, 10, true));
    public static final Block RUBY_PRESSURE_PLATE = registerBlock("ruby_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(ModBlocks.RUBY_BLOCK), BlockSetType.IRON));

    public static final Block RUBY_FENCE = registerBlock("ruby_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.RUBY_BLOCK)));
   public static final Block RUBY_FENCE_GATE = registerBlock("ruby_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.RUBY_BLOCK), WoodType.ACACIA));
    public static final Block RUBY_WALL = registerBlock("ruby_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.RUBY_BLOCK)));

   public static final Block RUBY_DOOR = registerBlock("ruby_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR), BlockSetType.IRON));
    public static final Block RUBY_TRAPDOOR = registerBlock("ruby_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR), BlockSetType.IRON));

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
