package aa11lo.survivalgearfood.item;

import aa11lo.survivalgearfood.init.ModItems;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFoodReturnCan extends ItemFoodBasic {

    public ItemFoodReturnCan(int healammount, float saturation, String registryName) {
        super(healammount, saturation, registryName);
    }
    

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        super.onItemUseFinish(stack, worldIn, entityLiving);
        return new ItemStack(ModItems.ITEM_USED_CAN);
    }
}