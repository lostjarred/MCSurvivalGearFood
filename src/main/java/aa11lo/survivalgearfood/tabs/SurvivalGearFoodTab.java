package aa11lo.survivalgearfood.tabs;

import aa11lo.survivalgearfood.SurvivalGearFoodMain;
import aa11lo.survivalgearfood.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SurvivalGearFoodTab extends CreativeTabs {
    
    public SurvivalGearFoodTab(){
        super(SurvivalGearFoodMain.MODID);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack createIcon(){
        return new ItemStack(ModItems.ITEM_CANNED_APPLE);
    }
}