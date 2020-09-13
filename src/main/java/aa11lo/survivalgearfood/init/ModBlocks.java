package aa11lo.survivalgearfood.init;

import aa11lo.survivalgearfood.SurvivalGearFoodMain;
import aa11lo.survivalgearfood.block.CardboardBox.BlockCardboardBoxCans;
import aa11lo.survivalgearfood.block.CardboardBox.BlockCardboardBox;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static void register(IForgeRegistry<Block> registry) {
        SurvivalGearFoodMain.LOGGER.info("Registering Blocks");
        registry.registerAll(
            BLOCK_CARDBOARD_BOX_CAN,
            BLOCK_CARDBOARD_BOX
        );
        SurvivalGearFoodMain.LOGGER.info("Registering Blocks finished");
        /*SurvivalGearFoodMain.LOGGER.info("Registering Tile Enitys");
        GameRegistry.registerTileEntity(BLOCK_CARDBOARD_BOX_CAN.getTileEntityClass(), BLOCK_CARDBOARD_BOX_CAN.getRegistryName().toString());
        SurvivalGearFoodMain.LOGGER.info("Registering Tile Enitty finished");*/
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        SurvivalGearFoodMain.LOGGER.info("Registering Item Blocks");
        registry.registerAll(
            BLOCK_CARDBOARD_BOX_CAN.createItemBlock(),
            BLOCK_CARDBOARD_BOX.createItemBlock()
        );
        SurvivalGearFoodMain.LOGGER.info("Registering Item Blocks finished");
    }

    public static void registerModels() {
        SurvivalGearFoodMain.LOGGER.info("Registering Block Models");
        BLOCK_CARDBOARD_BOX_CAN.registerItemModel(Item.getItemFromBlock(BLOCK_CARDBOARD_BOX_CAN));
        BLOCK_CARDBOARD_BOX.registerItemModel(Item.getItemFromBlock(BLOCK_CARDBOARD_BOX));
        SurvivalGearFoodMain.LOGGER.info("Registering Block Models finished");

    }
    public static final BlockCardboardBox BLOCK_CARDBOARD_BOX = new BlockCardboardBox("block_cardboard_box");
    public static final BlockCardboardBoxCans BLOCK_CARDBOARD_BOX_CAN = new BlockCardboardBoxCans("block_cardboard_box_can");    
}