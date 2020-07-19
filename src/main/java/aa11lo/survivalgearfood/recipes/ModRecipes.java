package aa11lo.survivalgearfood.recipes;

import aa11lo.survivalgearfood.SurvivalGearFoodMain;
import aa11lo.survivalgearfood.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
    public static void initSmelting() {
        SurvivalGearFoodMain.LOGGER.info("Adding smelting recipes");
        GameRegistry.addSmelting(ModItems.ITEM_USED_CAN, new ItemStack(Items.IRON_NUGGET, 4), 0.0F);
    }
}