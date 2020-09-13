package aa11lo.survivalgearfood.item;

import aa11lo.survivalgearfood.SurvivalGearFoodMain;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemMetaBasic extends Item {
    
    protected String name;

    public ItemMetaBasic(String Name){
        this.name = Name;
        setRegistryName(name);
        setCreativeTab(SurvivalGearFoodMain.SurvivalGearFoodCreativeTab);
    }

    public void registerItemModel() {
        SurvivalGearFoodMain.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemMetaBasic setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}