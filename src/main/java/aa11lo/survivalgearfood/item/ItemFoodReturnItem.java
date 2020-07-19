package aa11lo.survivalgearfood.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFoodReturnItem  extends ItemFood{
    ItemStack ReturnItem; 
    public ItemFoodReturnItem(int amount, float saturation, Item Returneditem) {
        super(amount, saturation, false);
        ReturnItem = new ItemStack(Returneditem); 
        maxStackSize = 1;
    }

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        super.onItemUseFinish(stack, worldIn, entityLiving);
        return this.ReturnItem;
    }
    
}