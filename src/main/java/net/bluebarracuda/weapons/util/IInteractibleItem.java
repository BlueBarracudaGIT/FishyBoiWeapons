package net.bluebarracuda.weapons.util;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface IInteractibleItem
{
    default ActionResult<ItemStack> clientRightClick(World world, PlayerEntity player, ItemStack held, boolean isSneaking)
    {
        return new ActionResult<>(ActionResultType.PASS, held);
    }

    default ActionResult<ItemStack> serverRightClick(World world, PlayerEntity player, ItemStack held, boolean isSneaking)
    {
        return new ActionResult<>(ActionResultType.PASS, held);
    }

    default ActionResultType clientBlockClick(World world, PlayerEntity player, BlockPos pos, ItemStack held, boolean isSneaking) { return ActionResultType.PASS; }
    default ActionResultType serverBlockClick(World world, PlayerEntity player, BlockPos pos, ItemStack held, boolean isSneaking) { return ActionResultType.PASS; }
}
