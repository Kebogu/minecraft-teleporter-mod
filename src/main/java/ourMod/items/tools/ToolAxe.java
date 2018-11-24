package ourMod.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import ourMod.Main;
import ourMod.init.ModItems;
import ourMod.utils.IHasModel;

public class ToolAxe extends ItemAxe implements IHasModel{
	public ToolAxe(String name, ToolMaterial material) {
		super(material, 6.0f, -3.2f);
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
