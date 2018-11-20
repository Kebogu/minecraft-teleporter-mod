package ourMod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ourMod.Main;
import ourMod.init.ModItems;
import ourMod.utils.IHasModel;

public class ItemBase extends Item implements IHasModel{
	
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0 ,"inventory");
		
	}

}
