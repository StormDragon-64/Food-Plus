package net.stormdragon_64.food_plus.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.stormdragon_64.food_plus.item.ModItems;


    public class IceCreamTub extends Block {
    public static final BooleanProperty IS_VANILLA = BooleanProperty.create("is_vanilla");
    public static final BooleanProperty IS_CHOCOLATE = BooleanProperty.create("is_chocolate");
    public static final IntegerProperty FILL = IntegerProperty.create("fill", 0, 4);
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public IceCreamTub(Properties properties) {
        super(properties);
    }

    private static final VoxelShape SHAPE_NS =  Block.box(3.5, 0, 2, 12.5, 12, 14);
    private static final VoxelShape SHAPE_EW =  Block.box(2, 0, 3.5, 14, 12, 12.5);
    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        switch (pState.getValue(FACING)) {
            case NORTH:
                return SHAPE_NS;
            case EAST:
                return SHAPE_EW;
            case WEST:
                return SHAPE_EW;
            case SOUTH:
                return SHAPE_NS;
            default:
                return SHAPE_NS;
        }
    }

    /* FACING */

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState pState, Rotation pRotation) {
        return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState pState, Mirror pMirror) {
        return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING, FILL, IS_CHOCOLATE, IS_VANILLA);
    }
    // this checks what type of ice cream the player is holding and replaces it with an empty cone.
    // if the player has chocolate, we give the block the is_chocolate state, same for the rest of the flavors.
    // we also check if we already have a type of ice cream, because if we didn't then
    //  it would set all of the ice cream to the same type. not good.
    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand,
                                 BlockHitResult pResult) {
        if (!pLevel.isClientSide() && pHand == InteractionHand.MAIN_HAND) {
            boolean currently_is_vanilla = pState.getValue(IS_VANILLA);
            boolean currently_is_chocolate = pState.getValue(IS_CHOCOLATE);
            if (pPlayer.getItemInHand(pHand).equals(ModItems.VANILLA_ICE_CREAM) && currently_is_chocolate == false) {
                int current_fill_level = pState.getValue(FILL);
                if (current_fill_level < 4) 
                    pPlayer.getItemInHand(pHand).equals(ModItems.EMPTY_CONE);
                pLevel.setBlock(pPos, pState.setValue(IS_VANILLA, true), 3);
                    pLevel.setBlock(pPos, pState.setValue(FILL, current_fill_level + 1), 3);

            } else if ((pPlayer.getItemInHand(pHand).equals(ModItems.CHOCOLATE_ICE_CREAM) && currently_is_vanilla) == false) {
                int current_fill_level = pState.getValue(FILL);
                if (current_fill_level < 4) {
                    pPlayer.getItemInHand(pHand).equals(ModItems.EMPTY_CONE);
                    pLevel.setBlock(pPos, pState.setValue(IS_CHOCOLATE, true), 3);
                    pLevel.setBlock(pPos, pState.setValue(FILL, current_fill_level + 1), 3);
                }

            }
        }
        return super.use(pState, pLevel, pPos, pPlayer, pHand, pResult);
    }
}