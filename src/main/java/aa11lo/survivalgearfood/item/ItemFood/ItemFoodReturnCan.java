package aa11lo.survivalgearfood.item.ItemFood;

import aa11lo.survivalgearfood.init.ModItems;

public class ItemFoodReturnCan extends ItemFoodReturnItem {

    public ItemFoodReturnCan(int healammount, float saturation, String registryName) {
        super(healammount, saturation, registryName, ModItems.ITEM_USED_CAN);
    }
}