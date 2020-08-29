package aa11lo.survivalgearfood.item.ItemFood;

import aa11lo.survivalgearfood.SurvivalGearFoodMain;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemFoodBasic extends ItemFood {

    protected String name;

    public ItemFoodBasic(int healammount, float saturation, String name) {
        super(healammount, saturation, false);
        this.name = name;
        setTranslationKey(SurvivalGearFoodMain.MODID + "." + name);
        setRegistryName(name);
        setCreativeTab(SurvivalGearFoodMain.SurvivalGearFoodCreativeTab);
    }

    public void registerItemModel() {
        SurvivalGearFoodMain.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemFoodBasic setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}