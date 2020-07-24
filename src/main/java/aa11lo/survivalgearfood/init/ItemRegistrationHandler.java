package aa11lo.survivalgearfood.init;

import aa11lo.survivalgearfood.SurvivalGearFoodMain;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;


@EventBusSubscriber(modid = SurvivalGearFoodMain.MODID)
public class ItemRegistrationHandler {
    @SubscribeEvent
    public static void registerItems(Register<Item> event){
        SurvivalGearFoodMain.LOGGER.info("Begining Item Registration");
            
            for(int i =0; i < ModItems.items.length; i++){
                SurvivalGearFoodMain.LOGGER.info("Registering " + ModItems.items[i].getTranslationKey());
                event.getRegistry().register(ModItems.items[i]);
            }

        SurvivalGearFoodMain.LOGGER.info("Finished Item Registration");
    }
}