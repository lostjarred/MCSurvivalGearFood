package aa11lo.survivalgearfood.block.TileEntity.cardboardbox;

import javax.annotation.Nullable;

import aa11lo.survivalgearfood.block.TileEntity.BlockTileEntity;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

public class BlockTECardboardBox extends BlockTileEntity {

    public BlockTECardboardBox(Material materialIn, String name) {
        super(materialIn, name);
    }

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
		if (!world.isRemote) {
			TileEntityCardboardBox tile = (TileEntityCardboardBox) getTileEntity(world, pos);
			IItemHandler itemHandler = tile.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, side);
			tile.markDirty();
		}
		return true;
	}
    
    @Override
	public Class<TileEntityCardboardBox> getTileEntityClass() {
		return TileEntityCardboardBox.class;
    }
    
    @Nullable
	@Override
	public TileEntityCardboardBox createTileEntity(World world, IBlockState state) {
		return new TileEntityCardboardBox();
	}
}