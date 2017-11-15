package de.webtwob.mbma.core.common.block;

import de.webtwob.mbma.api.enums.MachineState;
import de.webtwob.mbma.api.interfaces.tileentity.IMultiBlockTile;
import de.webtwob.mbma.api.property.MBMAProperties;
import de.webtwob.mbma.core.common.creativetab.MBMACreativeTab;
import de.webtwob.mbma.core.common.tileentity.TileEntityCraftingStorage;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Created by BB20101997 on 28. Okt. 2017.
 */
public class BlockCraftingStorage extends Block {
    public BlockCraftingStorage() {
        super(Material.IRON);
        
        setCreativeTab(MBMACreativeTab.MBMATab);
        
        IBlockState state = blockState.getBaseState();
        state = state.withProperty(MBMAProperties.STATE, MachineState.IDLE);
        setDefaultState(state);
    }
    
    @SuppressWarnings("deprecation")
    @Nonnull
    @Deprecated
    @Override
    public IBlockState getActualState(@Nonnull IBlockState state, IBlockAccess worldIn, BlockPos pos) {
        return super.getActualState(state, worldIn, pos);
    }
    
    @Nonnull
    @Override
    public IBlockState getExtendedState(@Nonnull IBlockState state, IBlockAccess world, BlockPos pos) {
        return super.getExtendedState(state, world, pos);
    }
    
    @Nonnull
    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, MBMAProperties.STATE);
    }
    
    @Override
    public int getMetaFromState(IBlockState state) {
        return 0;
    }
    
    @Override
    public boolean hasTileEntity(IBlockState state) {
        return true;
    }
    
    @Nullable
    @Override
    public TileEntity createTileEntity(@Nonnull World world, @Nonnull IBlockState state) {
        return new TileEntityCraftingStorage();
    }@Override
    public void breakBlock(@Nonnull World worldIn, @Nonnull BlockPos pos, @Nonnull IBlockState state) {
        TileEntity tileEntity = worldIn.getTileEntity(pos);
        
        if (tileEntity instanceof IMultiBlockTile) {
            ((IMultiBlockTile) tileEntity).onBlockBreak(worldIn,pos);
        }
        
        super.breakBlock(worldIn, pos, state);
    }
}
