package aa11lo.survivalgearfood.proxy;

import net.minecraft.item.Item;
import net.minecraft.util.text.translation.I18n;

public class CommonProxy {

	public void registerItemRenderer(Item itemBasic, int meta, String name) {
	}

	public String localize(String unlocalized, Object... args) {
		return I18n.translateToLocalFormatted(unlocalized, args);
	}
    
}