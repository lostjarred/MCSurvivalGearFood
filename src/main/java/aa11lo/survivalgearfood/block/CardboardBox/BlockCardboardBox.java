package aa11lo.survivalgearfood.block.CardboardBox;

import aa11lo.survivalgearfood.block.BlockBasic;
import net.minecraft.block.material.Material;

public class BlockCardboardBox extends BlockBasic {

    public BlockCardboardBox(String name) {
        super(Material.CLOTH, name);
        setHardness(0.8f);
        setResistance(1.0f);
    }
    
}