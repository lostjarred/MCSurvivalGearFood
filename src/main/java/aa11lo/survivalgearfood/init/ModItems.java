package aa11lo.survivalgearfood.init;

import aa11lo.survivalgearfood.SurvivalGearFoodMain;
import aa11lo.survivalgearfood.item.ItemBasic;
import aa11lo.survivalgearfood.item.ItemFoodBasic;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(SurvivalGearFoodMain.MODID)
public class ModItems {

    //ITEMS
    public static final Item ITEM_CANNED_APPLE = null;

    //FOOD
    public static final Item ITEM_FOOD_CANNED_APPLE = null;

    @EventBusSubscriber(modid = SurvivalGearFoodMain.MODID)
    public static class RegistrationHandler{
        @SubscribeEvent
        public static void registerItems(Register<Item> event){
            final Item[] items ={
                new ItemBasic("item_canned_apple"),
                new ItemFoodBasic(4, 0.5f, "item_food_canned_apple")
            };
            
            SurvivalGearFoodMain.LOGGER.info("Begining Item Registration");
            
            for(int i =0; i < items.length; i++){
                SurvivalGearFoodMain.LOGGER.info("Registering " + items[i].getTranslationKey());
                event.getRegistry().register(items[i]);
            }
        }
    }

}