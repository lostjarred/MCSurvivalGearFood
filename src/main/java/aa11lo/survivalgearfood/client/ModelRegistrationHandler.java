package aa11lo.survivalgearfood.client;

import aa11lo.survivalgearfood.SurvivalGearFoodMain;
import aa11lo.survivalgearfood.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(value = Side.CLIENT, modid = SurvivalGearFoodMain.MODID)
public class ModelRegistrationHandler {
    @SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
        /*registerModel(ModItems.ITEM_USED_CAN);



        //food stuff
        registerModel(ModItems.ITEM_CANNED_APPLE);
        registerModel(ModItems.ITEM_FOOD_CANNED_APPLE);

        registerModel(ModItems.ITEM_CANNED_MUSHROOMSTEW);
        registerModel(ModItems.ITEM_FOOD_CANNED_MUSHROOMSTEW);
        
        registerModel(ModItems.ITEM_CANNED_BREAD);
        registerModel(ModItems.ITEM_FOOD_CANNED_BREAD);

        registerModel(ModItems.ITEM_CANNED_PORK);
        registerModel(ModItems.ITEM_FOOD_CANNED_PORK);

        registerModel(ModItems.ITEM_CANNED_FISH);
        registerModel(ModItems.ITEM_FOOD_CANNED_FISH);

        registerModel(ModItems.ITEM_CANNED_MELON);
        registerModel(ModItems.ITEM_FOOD_CANNED_MELON);

        registerModel(ModItems.ITEM_CANNED_BEEF);
        registerModel(ModItems.ITEM_FOOD_CANNED_BEEF);

        registerModel(ModItems.ITEM_CANNED_CHICKEN);
        registerModel(ModItems.ITEM_FOOD_CANNED_CHICKEN);

        registerModel(ModItems.ITEM_CANNED_CARROT);
        registerModel(ModItems.ITEM_FOOD_CANNED_CARROT);

        registerModel(ModItems.ITEM_CANNED_POTATO);
        registerModel(ModItems.ITEM_FOOD_CANNED_POTATO);

        registerModel(ModItems.ITEM_CANNED_RABBIT);
        registerModel(ModItems.ITEM_FOOD_CANNED_RABBIT);

        registerModel(ModItems.ITEM_CANNED_MUTTON);
        registerModel(ModItems.ITEM_FOOD_CANNED_MUTTON);

        registerModel(ModItems.ITEM_CANNED_BEETROOT);
        registerModel(ModItems.ITEM_FOOD_CANNED_BEETROOT);*/

        registeritemmodels(ModItems.items);
    }

    private static void registeritemmodels(Item[] items){
        aa11lo.survivalgearfood.SurvivalGearFoodMain.LOGGER.info("registering models");
        for(int i = 0; i < items.length; i ++){
            aa11lo.survivalgearfood.SurvivalGearFoodMain.LOGGER.info("registering model for " + items[i].getRegistryName());
            ModelResourceLocation modellocation = new ModelResourceLocation(items[i].getRegistryName(), "inventory");
            ModelLoader.setCustomModelResourceLocation(items[i], 0, modellocation);
        }

    }

    private static void registerModel(Item item) {
        registerModel(item, 0);
	}


    private static void registerModel(Item item, int meta) {
        aa11lo.survivalgearfood.SurvivalGearFoodMain.LOGGER.info("registering model for " + item.getRegistryName());
        
        ModelLoader.setCustomModelResourceLocation(item, meta, 
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
    
    
}