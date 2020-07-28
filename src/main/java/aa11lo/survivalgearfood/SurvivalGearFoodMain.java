package aa11lo.survivalgearfood;

import org.apache.logging.log4j.Logger;

import aa11lo.survivalgearfood.init.ModBlocks;
import aa11lo.survivalgearfood.init.ModItems;
import aa11lo.survivalgearfood.proxy.CommonProxy;
import aa11lo.survivalgearfood.recipes.ModRecipes;
import aa11lo.survivalgearfood.tabs.SurvivalGearFoodTab;

import org.apache.logging.log4j.LogManager;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = SurvivalGearFoodMain.MODID, name = SurvivalGearFoodMain.NAME, version = SurvivalGearFoodMain.VERSION, acceptedMinecraftVersions = SurvivalGearFoodMain.MC_VERSION)
public class SurvivalGearFoodMain {
	
	@SidedProxy(serverSide = "aa11lo.survivalgearfood.proxy.CommonProxy", clientSide = "aa11lo.survivalgearfood.proxy.ClientProxy")
	public static CommonProxy proxy;

	public static final String MODID = "survivalgearfood";
	public static final String NAME = "Survival Gear Food Mod";
	public static final String VERSION = "0.2.0";
	public static final String MC_VERSION = "[1.12.2]";

	public static final Logger LOGGER = LogManager.getLogger(SurvivalGearFoodMain.MODID);

	public static final CreativeTabs SurvivalGearFoodCreativeTab = new SurvivalGearFoodTab();

	

	@EventHandler
	public void preInit(final FMLPreInitializationEvent event) {

	}

	@EventHandler
	public void init(final FMLInitializationEvent event) {
		LOGGER.info(SurvivalGearFoodMain.NAME + ": Loading");
		ModRecipes.initSmelting();
	}

	@EventHandler
	public void postInit(final FMLPostInitializationEvent event) {
        
	}

	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event){
			ModItems.register(event.getRegistry());
			ModBlocks.registerItemBlocks(event.getRegistry());
		}

		@SubscribeEvent
		public static void registerModels(ModelRegistryEvent event){
			ModItems.registerModels();
			ModBlocks.registerModels();
		}

		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event){
			ModBlocks.register(event.getRegistry());
		}
	}

}