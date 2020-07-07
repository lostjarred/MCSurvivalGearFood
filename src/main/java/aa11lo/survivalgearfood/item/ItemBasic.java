package aa11lo.survivalgearfood.item;


import aa11lo.survivalgearfood.SurvivalGearFoodMain;
import net.minecraft.item.Item;

public class ItemBasic extends Item{
    public ItemBasic(String registryName){
        setTranslationKey(SurvivalGearFoodMain.MODID + "." + registryName);
        setRegistryName(registryName);
        setCreativeTab(SurvivalGearFoodMain.SurvivalGearFoodCreativeTab);
    }
}