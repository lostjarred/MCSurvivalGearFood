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

    //FOOD ITEMS
    //APPLE
    public static final Item ITEM_CANNED_APPLE = null;
    public static final Item ITEM_FOOD_CANNED_APPLE = null;
    //MUSHROOMSTEW
    public static final Item ITEM_CANNED_MUSHROOMSTEW = null;
    public static final Item ITEM_FOOD_CANNED_MUSHROOMSTEW = null;
    //BREAD
    public static final Item ITEM_CANNED_BREAD = null;
    public static final Item ITEM_FOOD_CANNED_BREAD = null;
    //PORKCHOP
    public static final Item ITEM_CANNED_PORK = null;
    public static final Item ITEM_FOOD_CANNED_PORK = null;
    //FISH
    public static final Item ITEM_CANNED_FISH = null;
    public static final Item ITEM_FOOD_CANNED_FISH = null;
    //MELON
    public static final Item ITEM_CANNED_MELON = null;
    public static final Item ITEM_FOOD_CANNED_MELON = null;
    //BEEF
    public static final Item ITEM_CANNED_BEEF = null;
    public static final Item ITEM_FOOD_CANNED_BEEF = null;
    //CHICKEN
    public static final Item ITEM_CANNED_CHICKEN = null;
    public static final Item ITEM_FOOD_CANNED_CHICKEN = null;
    //CARROT
    public static final Item ITEM_CANNED_CARROT = null;
    public static final Item ITEM_FOOD_CANNED_CARROT = null;
    //POTATO
    public static final Item ITEM_CANNED_POTATO = null;
    public static final Item ITEM_FOOD_CANNED_POTATO = null;
    //RABBIT
    public static final Item ITEM_CANNED_RABBIT = null;
    public static final Item ITEM_FOOD_CANNED_RABBIT = null;
    //MUTTON
    public static final Item ITEM_CANNED_MUTTON = null;
    public static final Item ITEM_FOOD_CANNED_MUTTON = null;
    //BEETROOT
    public static final Item ITEM_CANNED_BEETROOT = null;
    public static final Item ITEM_FOOD_CANNED_BEETROOT = null;

    @EventBusSubscriber(modid = SurvivalGearFoodMain.MODID)
    public static class RegistrationHandler{
        @SubscribeEvent
        public static void registerItems(Register<Item> event){
            final Item[] items ={
                //apple art done
                new ItemBasic("item_canned_apple"),
                    //food values 4, 0.3
                new ItemFoodBasic(4, 0.5f, "item_food_canned_apple"),
                
                //mushroomstew art done
                new ItemBasic("item_canned_mushroomstew"),
                    //food values 6, 0.6
                new ItemFoodBasic(6, 0.6f, "item_food_canned_mushroomstew"),
                
                //bread art done 
                new ItemBasic("item_canned_bread"),
                    //food values 5, 0.6
                new ItemFoodBasic(5, 0.6f, "item_food_canned_bread"),
                
                //pork art done
                new ItemBasic("item_canned_pork"),
                    //food values 8, 0.8
                new ItemFoodBasic(8, 0.8f, "item_food_canned_pork"),
                
                //fish art done
                new ItemBasic("item_canned_fish"),
                    //food values cod 5, 0.6
                new ItemFoodBasic(2, 0.1f, "item_food_canned_fish"),
                
                //melon art done
                new ItemBasic("item_canned_melon"),
                    //food values 2, 0.3
                new ItemFoodBasic(2, 0.3f, "item_food_canned_melon"),
                
                //beef art done
                new ItemBasic("item_canned_beef"),
                    //food values 8, 0.8
                new ItemFoodBasic(8, 0.8f, "item_food_canned_beef"),
                
                //chicken art done
                new ItemBasic("item_canned_chicken"),
                    //food values 6, 0.6
                new ItemFoodBasic(6, 0.6f, "item_food_canned_chicken"),
                
                //carrot art done
                new ItemBasic("item_canned_carrot"),
                    //food values 3, 0.6
                new ItemFoodBasic(3, 0.6f, "item_food_canned_carrot"),
                
                //potato art done
                new ItemBasic("item_canned_potato"),
                    //food values 5, 0.6
                new ItemFoodBasic(5, 0.6f, "item_food_canned_potato"),
                
                //rabbot art done
                new ItemBasic("item_canned_rabbit"),
                    //food values 5, 0.6
                new ItemFoodBasic(5, 0.6f, "item_food_canned_rabbit"),
                
                //mutton art done
                new ItemBasic("item_canned_mutton"),
                    //food values 6, 0.8
                new ItemFoodBasic(6, 0.8f, "item_food_canned_mutton"),
                
                //beetroot art done
                new ItemBasic("item_canned_beetroot"),
                    //food values 1, 0.6
                new ItemFoodBasic(1, 0.6f, "item_food_canned_beetroot"),
            };
            
            SurvivalGearFoodMain.LOGGER.info("Begining Item Registration");
            
            for(int i =0; i < items.length; i++){
                SurvivalGearFoodMain.LOGGER.info("Registering " + items[i].getTranslationKey());
                event.getRegistry().register(items[i]);
            }

            SurvivalGearFoodMain.LOGGER.info("Finished Item Registration");
        }
    }

}