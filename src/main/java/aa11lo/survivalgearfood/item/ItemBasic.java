package aa11lo.survivalgearfood.item;


import aa11lo.survivalgearfood.SurvivalGearFoodMain;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBasic extends Item{

    protected String name;

    public ItemBasic(String name){
        this.name = name;
        setTranslationKey(SurvivalGearFoodMain.MODID + "." + name);
        setRegistryName(name);
        setCreativeTab(SurvivalGearFoodMain.SurvivalGearFoodCreativeTab);
    }

    public void registerItemModel() {
        SurvivalGearFoodMain.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemBasic setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}