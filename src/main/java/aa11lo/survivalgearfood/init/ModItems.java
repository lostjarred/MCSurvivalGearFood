package aa11lo.survivalgearfood.init;

import aa11lo.survivalgearfood.SurvivalGearFoodMain;
import aa11lo.survivalgearfood.item.ItemBasic;
import aa11lo.survivalgearfood.item.ItemMinecraftFoodCan;
import aa11lo.survivalgearfood.item.ItemFood.ItemFoodReturnCan;
import aa11lo.survivalgearfood.item.ItemFood.ItemFoodReturnItem;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    public static void register(IForgeRegistry<Item> registry) {
        SurvivalGearFoodMain.LOGGER.info("Registering Items");
        registry.registerAll(
            ITEM_MINECRAFTFOODCANS,
            ITEM_USED_CAN,
            ITEM_FOOD_CANNED_APPLE,
            ITEM_FOOD_CANNED_MUSHROOMSTEW,
            ITEM_FOOD_CANNED_BREAD,
            ITEM_FOOD_CANNED_BREAD,
            ITEM_FOOD_CANNED_PORK,
            ITEM_FOOD_CANNED_FISH,
            ITEM_FOOD_CANNED_MELON,
            ITEM_FOOD_CANNED_BEEF,
            ITEM_FOOD_CANNED_CHICKEN,
            ITEM_FOOD_CANNED_CARROT,
            ITEM_FOOD_CANNED_POTATO,
            ITEM_FOOD_CANNED_RABBIT,
            ITEM_FOOD_CANNED_MUTTON,
            ITEM_FOOD_CANNED_BEETROOT
        );
        SurvivalGearFoodMain.LOGGER.info("Registering Items finished");
    }

    public static void registerModels(){
        SurvivalGearFoodMain.LOGGER.info("Registering Item Models");
        ITEM_MINECRAFTFOODCANS.registerItemModel();
        ITEM_USED_CAN.registerItemModel();
        ITEM_FOOD_CANNED_APPLE.registerItemModel();
        ITEM_FOOD_CANNED_MUSHROOMSTEW.registerItemModel();
        ITEM_FOOD_CANNED_BREAD.registerItemModel();
        ITEM_FOOD_CANNED_BREAD.registerItemModel();
        ITEM_FOOD_CANNED_PORK.registerItemModel();
        ITEM_FOOD_CANNED_FISH.registerItemModel();
        ITEM_FOOD_CANNED_MELON.registerItemModel();
        ITEM_FOOD_CANNED_BEEF.registerItemModel();
        ITEM_FOOD_CANNED_CHICKEN.registerItemModel();
        ITEM_FOOD_CANNED_CARROT.registerItemModel();
        ITEM_FOOD_CANNED_POTATO.registerItemModel();
        ITEM_FOOD_CANNED_RABBIT.registerItemModel();
        ITEM_FOOD_CANNED_MUTTON.registerItemModel();
        ITEM_FOOD_CANNED_BEETROOT.registerItemModel();
        SurvivalGearFoodMain.LOGGER.info("Registering Item Models finished");
    }

    //ITEMS
    public static final ItemBasic ITEM_USED_CAN = new ItemBasic("item_used_can");
    public static final ItemBasic ITEM_CANTEEN_CUP = new ItemBasic("item_canteen_cup");
    public static final ItemBasic ITEM_DRIED_COFFEE = new ItemBasic("item_dried_coffee");
    
    //DRINKS
    public static final ItemFoodReturnItem ITEM_FOOD_BLACKCOFFEE_CANTEENCUP = new ItemFoodReturnItem(4, 0.2f, "item_food_blackcoffee_canteencup", ITEM_CANTEEN_CUP);
    //FOOD ITEMs

    //Minecraft
    public static final ItemMinecraftFoodCan ITEM_MINECRAFTFOODCANS = new ItemMinecraftFoodCan("item_minecraftfoodcans");
    //APPLE food values 4, 0.3
    public static final ItemFoodReturnCan ITEM_FOOD_CANNED_APPLE = new ItemFoodReturnCan(4, 0.5f, "item_food_canned_apple");
    
    //MUSHROOMSTEW food values 6, 0.6
    public static final ItemFoodReturnCan ITEM_FOOD_CANNED_MUSHROOMSTEW = new ItemFoodReturnCan(6, 0.6f, "item_food_canned_mushroomstew");
    
    //BREAD food values 5, 0.6
    public static final ItemFoodReturnCan ITEM_FOOD_CANNED_BREAD = new ItemFoodReturnCan(5, 0.6f, "item_food_canned_bread");
    
    //PORKCHOP food values 8, 0.8
    public static final ItemFoodReturnCan ITEM_FOOD_CANNED_PORK = new ItemFoodReturnCan(8, 0.8f, "item_food_canned_pork");
    
    //FISH food values cod 5, 0.6
    public static final ItemFoodReturnCan ITEM_FOOD_CANNED_FISH = new ItemFoodReturnCan(2, 0.1f, "item_food_canned_fish");
    
    //MELON food values 8, 0.8
    public static final ItemFoodReturnCan ITEM_FOOD_CANNED_MELON = new ItemFoodReturnCan(2, 0.3f, "item_food_canned_melon");
    
    //BEEF food values 8, 0.8
    public static final ItemFoodReturnCan ITEM_FOOD_CANNED_BEEF = new ItemFoodReturnCan(8, 0.8f, "item_food_canned_beef");
    
    //CHICKEN food values 6, 0.6
    public static final ItemFoodReturnCan ITEM_FOOD_CANNED_CHICKEN = new ItemFoodReturnCan(6, 0.6f, "item_food_canned_chicken");
    
    //CARROT food values 3, 0.6
    public static final ItemFoodReturnCan ITEM_FOOD_CANNED_CARROT = new ItemFoodReturnCan(3, 0.6f, "item_food_canned_carrot");
    
    //POTATO food values 5, 0.6
    public static final ItemFoodReturnCan ITEM_FOOD_CANNED_POTATO = new ItemFoodReturnCan(5, 0.6f, "item_food_canned_potato");
    
    //RABBIT food values 5, 0.6
    public static final ItemFoodReturnCan ITEM_FOOD_CANNED_RABBIT = new ItemFoodReturnCan(5, 0.6f, "item_food_canned_rabbit");
    
    //MUTTON food values 6, 0.8
    public static final ItemFoodReturnCan ITEM_FOOD_CANNED_MUTTON = new ItemFoodReturnCan(6, 0.8f, "item_food_canned_mutton");
    
    //BEETROOT food values 1, 0.6
    public static final ItemFoodReturnCan ITEM_FOOD_CANNED_BEETROOT = new ItemFoodReturnCan(1, 0.6f, "item_food_canned_beetroot");
}