package net.moskowitzrocket.tutorialmod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SpeedyBlock extends Block {
    public SpeedyBlock(Settings settings) {


        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player,
                              Hand hand, BlockHitResult hit) {

        //called 4 times on right click:
        //2 times on the server (for each hand)
        //2 times on the client (for each hand)
        if(world.isClient()) {
            if(hand == Hand.MAIN_HAND) {
                player.sendMessage(new LiteralText("Client: This is The Client! Main Hand!"), false);
            } else {
                player.sendMessage(new LiteralText("Client: This is the Client! Off Hand!"), false);
            }

        }



        return ActionResult.SUCCESS;
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if(!world.isClient()) {
            if(entity instanceof LivingEntity) {
                LivingEntity livingEntity = ((LivingEntity) entity);
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 300, 2));
            }
        }

        super.onSteppedOn(world, pos, state, entity);
    }
}
