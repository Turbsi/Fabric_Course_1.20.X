package net.turbsi.mccourse.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.turbsi.mccourse.block.ModBlocks;
import net.turbsi.mccourse.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PEAT_BLOCK)
                .pattern("XXX")
                .pattern("XCX")
                .pattern("XXX")
                .input('X', Blocks.STONE)
                .input('C', ModItems.RAW_RUBY)
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE))
                .criterion(hasItem(ModItems.RAW_RUBY), conditionsFromItem(ModItems.RAW_RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RUBY_ORE)));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RUBY, RecipeCategory.MISC, ModBlocks.RUBY_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_RUBY, RecipeCategory.MISC, ModBlocks.RAW_RUBY_BLOCK);

        offerSmelting(exporter, List.of(ModItems.RAW_RUBY, ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE,
                ModBlocks.NETHER_RUBY_ORE, ModBlocks.END_RUBY_ORE), RecipeCategory.MISC, ModItems.RUBY,
                0.25f, 200, "ruby");
        offerBlasting(exporter, List.of(ModItems.RAW_RUBY, ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE,
                ModBlocks.NETHER_RUBY_ORE, ModBlocks.END_RUBY_ORE), RecipeCategory.MISC, ModItems.RUBY,
                0.25f, 100, "ruby");

    }
}
