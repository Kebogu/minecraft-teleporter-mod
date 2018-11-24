package ourMod.init;


import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import ourMod.items.ItemBase;
import ourMod.items.armor.ArmorBase;
import ourMod.items.tools.ToolAxe;
import ourMod.items.tools.ToolHoe;
import ourMod.items.tools.ToolPickaxe;
import ourMod.items.tools.ToolSpade;
import ourMod.items.tools.ToolSword;
import ourMod.utils.Reference;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
//Materials
	public static final ToolMaterial MATERIAL_BLUE = EnumHelper.addToolMaterial("material_blue", 3, 560, 8.0F, 3.0F, 10);
	public static final ToolMaterial MATERIAL_DEMON = EnumHelper.addToolMaterial("material_demon", 4, 2561, 8.0F, 3.0F, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_BLUE_IGNOT = EnumHelper.addArmorMaterial("armor_material_blue_ignot", Reference.MOD_ID+":blue", 14,
			new int[] {2, 6, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
	
	//adds item 
//	public static final Item TESERACT = new ItemBase("teseract");
	public static final Item SOULSTONE = new ItemBase("soul_stone");
	public static final Item BLUE_IGNOT = new ItemBase("blue_ignot");
	
	//Tools
	public static final ItemSword BLUE_SWORD = new ToolSword("blue_sword",MATERIAL_BLUE);
	public static final ItemSpade BLUE_SHOVEL = new ToolSpade("blue_shovel",MATERIAL_BLUE);
	public static final ItemPickaxe BLUE_PICKAXE = new ToolPickaxe("blue_pickaxe",MATERIAL_BLUE);
	public static final ItemAxe BLUE_AXE = new ToolAxe("blue_axe",MATERIAL_BLUE);
	public static final ItemHoe BLUE_HOE = new ToolHoe("blue_hoe",MATERIAL_BLUE);
	
	public static final ItemSword DEMON_SWORD = new ToolSword("demon_sword",MATERIAL_DEMON);

	
	//Armor
	public static final Item BLUE_HELMET = new ArmorBase("blue_helmet", ARMOR_MATERIAL_BLUE_IGNOT, 1, EntityEquipmentSlot.HEAD); 
	public static final Item BLUE_CHESTPLATE = new ArmorBase("blue_chestplate",ARMOR_MATERIAL_BLUE_IGNOT,1,EntityEquipmentSlot.CHEST); 
	public static final Item BLUE_LEGGINGS = new ArmorBase("blue_leggings",ARMOR_MATERIAL_BLUE_IGNOT,2,EntityEquipmentSlot.LEGS); 
	public static final Item BLUE_BOOTS = new ArmorBase("blue_boots",ARMOR_MATERIAL_BLUE_IGNOT,1,EntityEquipmentSlot.FEET); 	

}
