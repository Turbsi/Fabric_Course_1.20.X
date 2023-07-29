package net.turbsi.mccourse.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.turbsi.mccourse.utils.ModTags;

public class ChainsawItem extends Item {
    public ChainsawItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(context.getWorld().isClient()){
            BlockPos posClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean sawedBlock = false;
            BlockState blockState = context.getWorld().getBlockState(posClicked);
            Block block = blockState.getBlock();

            if (isLogBlock(blockState)){
                outputLogMessage(player);
            }
        }

        return ActionResult.SUCCESS;
    }

    private boolean isLogBlock(BlockState blockState) {
        Block block = blockState.getBlock();
        return blockState.isIn(ModTags.Blocks.CHAINSAW_SAWABLE_LOG);
    }

    private void outputLogMessage(PlayerEntity player) {
        player.sendMessage(Text.literal("Chainsawed"));
    }

}
