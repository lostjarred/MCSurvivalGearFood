package aa11lo.survivalgearfood.block;

import aa11lo.survivalgearfood.SurvivalGearFoodMain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBasic extends Block {

    protected String name;

    public BlockBasic(Material materialIn, String name) {
        super(materialIn);
        this.name = name;
        setTranslationKey(SurvivalGearFoodMain.MODID + "." + name);
        setRegistryName(name);
        setCreativeTab(SurvivalGearFoodMain.SurvivalGearFoodCreativeTab);
    }

    public void registerItemModel(Item itemBlock) {
        SurvivalGearFoodMain.proxy.registerItemRenderer(itemBlock, 0, name);
    }

    public Item createItemBlock(){
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }

    @Override
    public BlockBasic setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
    
}