package net.stormdragon_64.food_plus.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.stormdragon_64.food_plus.item.ModItems;
import net.stormdragon_64.food_plus.util.ModTags;


public class IceCreamTub extends Block {
    static int maxfilllevel = 4;
    public static final BooleanProperty IS_VANILLA = BooleanProperty.create("is_vanilla");
    public static final BooleanProperty IS_CHOCOLATE = BooleanProperty.create("is_chocolate");
    public static final IntegerProperty FILL = IntegerProperty.create("fill", 0, maxfilllevel);
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public IceCreamTub(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(IS_CHOCOLATE, false)
                .setValue(IS_VANILLA, false));
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




    //facing direction

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


    // FUNCTIONALITY
        // allows the player to add ice cream to a tub and give them back an empty cone.

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand,
                                 BlockHitResult pResult) {
        if (!pLevel.isClientSide() && pHand == InteractionHand.MAIN_HAND) {
            //so we can't switch ice creams and magically convert all of the ice cream from one type to another.
            boolean currently_is_vanilla = pState.getValue(IS_VANILLA);
            boolean currently_is_chocolate = pState.getValue(IS_CHOCOLATE);

            if (pPlayer.getItemInHand(pHand).is(ModTags.Items.VANILLA_ICE_CREAMS) && currently_is_chocolate == false) {
                ItemStack coneIStack = new ItemStack(ModItems.EMPTY_CONE.get());
                pLevel.setBlock(pPos, pState.setValue(IS_VANILLA, true), 3);

                if (pState.getValue(FILL) < maxfilllevel) {
                    pPlayer.getItemInHand(pHand).shrink(1);
                    pLevel.setBlock(pPos, pState.setValue(FILL, pState.getValue(FILL) + 1), 3);
                    pPlayer.addItem(coneIStack);
                }
            } else if ((pPlayer.getItemInHand(pHand).is(ModTags.Items.CHOCOLATE_ICE_CREAMS)) && currently_is_vanilla == false) {
                ItemStack coneIStack = new ItemStack(ModItems.EMPTY_CONE.get());
                pLevel.setBlock(pPos, pState.setValue(IS_CHOCOLATE, true), 3);

                if (pState.getValue(FILL) < maxfilllevel) {
                    pPlayer.getItemInHand(pHand).shrink(1);
                    pLevel.setBlock(pPos, pState.setValue(FILL, pState.getValue(FILL) + 1), 3);
                    pPlayer.addItem(coneIStack);
                }

            }
        }
        return super.use(pState, pLevel, pPos, pPlayer, pHand, pResult);
        }

        }
