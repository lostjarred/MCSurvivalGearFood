package aa11lo.survivalgearfood.item.ItemFood;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFoodReturnItem  extends ItemFoodBasic{

    protected Item returnitem;

    public ItemFoodReturnItem(int healammount, float saturation, String name, Item itemtoreturn) {
        super(healammount, saturation, name);
        setMaxStackSize(1);
        setReturnItem(itemtoreturn);
    }

    public void setReturnItem(Item itemtoreturn) {
        this.returnitem = itemtoreturn;
    }

    public Item getReturnItem() {
        return returnitem;
    }

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        super.onItemUseFinish(stack, worldIn, entityLiving);
        return new ItemStack( getReturnItem() );
    }
    
}