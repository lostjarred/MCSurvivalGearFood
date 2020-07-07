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
        registerModel(ModItems.ITEM_CANNED_APPLE);
        registerModel(ModItems.ITEM_FOOD_CANNED_APPLE);
    }

    private static void registerModel(Item item) {
        registerModel(item, 0);
	}


    private static void registerModel(Item item, int meta) {
        aa11lo.survivalgearfood.SurvivalGearFoodMain.LOGGER.info("loading model from " + item.getRegistryName());
        
        ModelLoader.setCustomModelResourceLocation(item, meta, 
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
    
    
}