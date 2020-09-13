package aa11lo.survivalgearfood.block.CardboardBox;

import java.util.Random;

import aa11lo.survivalgearfood.init.ModBlocks;
import aa11lo.survivalgearfood.init.ModItems;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockCardboardBoxCans extends BlockCardboardBox {

    public BlockCardboardBoxCans(String name) {
        super(name);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(ModBlocks.BLOCK_CARDBOARD_BOX);
    }

    @Override
    public void breakBlock(World world, BlockPos pos, IBlockState state) {
        int itemstodrop = 6;
        for(int i = 0; i < itemstodrop; i ++){
            ItemStack stack = dropRandomItem(getDropItems(), RANDOM);
            EntityItem item = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), stack);
            world.spawnEntity(item);
        }
        super.breakBlock(world, pos, state);
    }

    public ItemStack dropRandomItem(ItemStack[] items, Random random){
        int lengthofarray = items.length;
        int randomnum = random.nextInt(lengthofarray);
        ItemStack selecteditem = items[randomnum];
        return selecteditem;
    }
    
    public ItemStack[] getDropItems(){
        ItemStack[] dropitems = {
            new ItemStack(ModItems.ITEM_MINECRAFTFOODCANS, 1, 0),
            new ItemStack(ModItems.ITEM_MINECRAFTFOODCANS, 1, 1),
            new ItemStack(ModItems.ITEM_MINECRAFTFOODCANS, 1, 2),
            new ItemStack(ModItems.ITEM_MINECRAFTFOODCANS, 1, 3),
            new ItemStack(ModItems.ITEM_MINECRAFTFOODCANS, 1, 4),
            new ItemStack(ModItems.ITEM_MINECRAFTFOODCANS, 1, 5),
            new ItemStack(ModItems.ITEM_MINECRAFTFOODCANS, 1, 6),
            new ItemStack(ModItems.ITEM_MINECRAFTFOODCANS, 1, 7),
            new ItemStack(ModItems.ITEM_MINECRAFTFOODCANS, 1, 8),
            new ItemStack(ModItems.ITEM_MINECRAFTFOODCANS, 1, 9),
            new ItemStack(ModItems.ITEM_MINECRAFTFOODCANS, 1, 10),
            new ItemStack(ModItems.ITEM_MINECRAFTFOODCANS, 1, 11),
            new ItemStack(ModItems.ITEM_MINECRAFTFOODCANS, 1, 12),
        };
        return dropitems;
    }
}