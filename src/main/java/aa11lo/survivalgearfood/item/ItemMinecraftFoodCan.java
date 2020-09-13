package aa11lo.survivalgearfood.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemMinecraftFoodCan extends ItemBasic {

    public ItemMinecraftFoodCan(String name) {
        super(name);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
    }
    
    public String getTranslationKString(ItemStack stack) {
        /*
        item_canned_apple item_canned_mushroomstew item_canned_bread item_canned_pork item_canned_fish item_canned_melon item_canned_beef
        item_canned_chicken item_canned_carrot item_canned_potato item_canned_rabbit item_canned_mutton item_canned_beetroot
        */
        int meta = stack.getMetadata();
        String trans = "item";
        switch (meta) {
            case 0: trans = "item_canned_apple";
            case 1: trans = "item_canned_mushroomstew";
            case 2: trans = "item_canned_bread";
            case 3: trans = "item_canned_pork";
            case 4: trans = "item_canned_fish";
            case 5: trans = "item_canned_melon";
            case 6: trans = "item_canned_beef";
            case 7: trans = "item_canned_chicken";
            case 8: trans = "item_canned_carrot";
            case 9: trans = "item_canned_potato";
            case 10: trans = "item_canned_rabbit";
            case 11: trans = "item_canned_mutton";
            case 12: trans = "item_canned_beetroot";
        }
        return trans;
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