package aa11lo.survivalgearfood.item;

import aa11lo.survivalgearfood.SurvivalGearFoodMain;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemMinecraftFoodCan extends ItemMetaBasic {

    public ItemMinecraftFoodCan(String name) {
        super(name);
        this.setHasSubtypes(true);
    }

    @Override
    public void registerItemModel() {
        SurvivalGearFoodMain.proxy.registerItemRenderer(this, 0, "item_canned_apple");
        SurvivalGearFoodMain.proxy.registerItemRenderer(this, 1, "item_canned_mushroomstew");
        SurvivalGearFoodMain.proxy.registerItemRenderer(this, 2, "item_canned_bread");
        SurvivalGearFoodMain.proxy.registerItemRenderer(this, 3, "item_canned_pork");
        SurvivalGearFoodMain.proxy.registerItemRenderer(this, 4, "item_canned_fish");
        SurvivalGearFoodMain.proxy.registerItemRenderer(this, 5, "item_canned_melon");
        SurvivalGearFoodMain.proxy.registerItemRenderer(this, 6, "item_canned_beef");
        SurvivalGearFoodMain.proxy.registerItemRenderer(this, 7, "item_canned_chicken");
        SurvivalGearFoodMain.proxy.registerItemRenderer(this, 8, "item_canned_carrot");
        SurvivalGearFoodMain.proxy.registerItemRenderer(this, 9, "item_canned_potato");
        SurvivalGearFoodMain.proxy.registerItemRenderer(this, 10, "item_canned_rabbit");
        SurvivalGearFoodMain.proxy.registerItemRenderer(this, 11, "item_canned_mutton");
        SurvivalGearFoodMain.proxy.registerItemRenderer(this, 12, "item_canned_beetroot");
    }
    
    public String getTranslationKey(ItemStack stack) {
        /*
        item_canned_apple item_canned_mushroomstew item_canned_bread item_canned_pork item_canned_fish item_canned_melon item_canned_beef
        item_canned_chicken item_canned_carrot item_canned_potato item_canned_rabbit item_canned_mutton item_canned_beetroot
        */
        int meta = stack.getMetadata();
        String trans = "item";
        switch (meta) {
            case 0: trans = "item_canned_apple";
            break;
            case 1: trans = "item_canned_mushroomstew";
            break;
            case 2: trans = "item_canned_bread";
            break;
            case 3: trans = "item_canned_pork";
            break;
            case 4: trans = "item_canned_fish";
            break;
            case 5: trans = "item_canned_melon";
            break;
            case 6: trans = "item_canned_beef";
            break;
            case 7: trans = "item_canned_chicken";
            break;
            case 8: trans = "item_canned_carrot";
            break;
            case 9: trans = "item_canned_potato";
            break;
            case 10: trans = "item_canned_rabbit";
            break;
            case 11: trans = "item_canned_mutton";
            break;
            case 12: trans = "item_canned_beetroot";
            break;
        }
        return "item." + SurvivalGearFoodMain.MODID + "." + trans;
    }

    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
    {
        if (this.isInCreativeTab(tab))
        {
            items.add(new ItemStack(this, 1, 0));
            items.add(new ItemStack(this, 1, 1));
            items.add(new ItemStack(this, 1, 2));
            items.add(new ItemStack(this, 1, 3));
            items.add(new ItemStack(this, 1, 4));
            items.add(new ItemStack(this, 1, 5));
            items.add(new ItemStack(this, 1, 6));
            items.add(new ItemStack(this, 1, 7));
            items.add(new ItemStack(this, 1, 8));
            items.add(new ItemStack(this, 1, 9));
            items.add(new ItemStack(this, 1, 10));
            items.add(new ItemStack(this, 1, 11));
            items.add(new ItemStack(this, 1, 12));
        }
    }

}