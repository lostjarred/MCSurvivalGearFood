package aa11lo.survivalgearfood.block;

import java.util.Random;

import aa11lo.survivalgearfood.block.BlockBasic;
import aa11lo.survivalgearfood.block.BlockCardboardBox;
import aa11lo.survivalgearfood.init.ModBlocks;
import aa11lo.survivalgearfood.init.ModItems;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockCarboardBoxCans extends BlockCardboardBox {

    public BlockCarboardBoxCans(String name) {
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

    public ItemStack dropRandomItem(Item[] items, Random random){
        int lengthofarray = items.length;
        int randomnum = random.nextInt(lengthofarray);
        Item selecteditem = items[randomnum];
        return new ItemStack(selecteditem);
    }
    
    public Item[] getDropItems(){
        Item[] dropitems = {
            ModItems.ITEM_CANNED_APPLE,
            ModItems.ITEM_CANNED_MUSHROOMSTEW,
            ModItems.ITEM_CANNED_BREAD,
            ModItems.ITEM_CANNED_PORK,
            ModItems.ITEM_CANNED_FISH,
            ModItems.ITEM_CANNED_MELON,
            ModItems.ITEM_CANNED_BEEF,
            ModItems.ITEM_CANNED_CHICKEN,
            ModItems.ITEM_CANNED_CARROT,
            ModItems.ITEM_CANNED_POTATO,
            ModItems.ITEM_CANNED_RABBIT,
            ModItems.ITEM_CANNED_MUTTON,
            ModItems.ITEM_CANNED_BEETROOT,
        };
        return dropitems;
    }
}