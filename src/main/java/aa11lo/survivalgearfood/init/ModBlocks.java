package aa11lo.survivalgearfood.init;

import aa11lo.survivalgearfood.SurvivalGearFoodMain;
import aa11lo.survivalgearfood.block.BlockBasic;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
            BLOCK_CARDBOARD_BOX_CAN
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
            BLOCK_CARDBOARD_BOX_CAN.createItemBlock()
        );
    }

    public static void registerModels() {
        BLOCK_CARDBOARD_BOX_CAN.registerItemModel(Item.getItemFromBlock(BLOCK_CARDBOARD_BOX_CAN));

    }

    public static final BlockBasic BLOCK_CARDBOARD_BOX_CAN = new BlockBasic(Material.CLOTH, "block_cardboard_box_can");    
}