package aa11lo.survivalgearfood.item;

import aa11lo.survivalgearfood.SurvivalGearFoodMain;
import net.minecraft.item.ItemFood;

public class ItemFoodBasic extends ItemFood {
    public ItemFoodBasic(int healammount, float saturation, String registryName) {
        super(healammount, saturation, false);

        setTranslationKey(SurvivalGearFoodMain.MODID + "." + registryName);
        setRegistryName(registryName);
        setCreativeTab(SurvivalGearFoodMain.SurvivalGearFoodCreativeTab);
    }

}