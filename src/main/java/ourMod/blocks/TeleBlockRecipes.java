package ourMod.blocks;

import java.util.Map;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import java.util.Map.Entry;
import com.google.common.collect.Table;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import ourMod.init.ModBlocks;

public class TeleBlockRecipes 
{
	
	private static final TeleBlockRecipes INSTANCE = new TeleBlockRecipes();
	private final Table<ItemStack, ItemStack, ItemStack> teleList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	private final Map<ItemStack, Float> experienceList =Maps.<ItemStack, Float>newHashMap();
	
	public static TeleBlockRecipes getInstance()
	{
		return INSTANCE; 
	}
	
	private TeleBlockRecipes()
	{
		//just for testing purposes
		addTeleBlockRecipes(new ItemStack(ModBlocks.BLUE_BLOCK), new ItemStack(ModBlocks.BLUE_ORE), new ItemStack(Blocks.CAKE), 5.0F);
		//
	}
	
	public void addTeleBlockRecipes(ItemStack input1, ItemStack input2, ItemStack result, float experience)
	{
		if(getTeleBlockResult(input1, input2) != ItemStack.EMPTY) return;
		this.teleList.put(input1, input2, result);
		this.experienceList.put(result, Float.valueOf(experience));
		
	}	
	
	public ItemStack getTeleBlockResult(ItemStack input1, ItemStack input2)
	{
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry: this.teleList.columnMap().entrySet())
		{
			if(this.compareItemStacks(input1, (ItemStack)entry.getKey()))
			{
				for (Entry<ItemStack, ItemStack> ent: entry.getValue().entrySet())
				{
					if (this.compareItemStacks(input2, (ItemStack)ent.getKey()))
					{
					return (ItemStack)ent.getValue();	
					}
				}
			}
		}
		return ItemStack.EMPTY;
	}
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
	{
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
		
	}
	
	public Table<ItemStack, ItemStack, ItemStack> getDualTeleList()
	{
		return this.teleList;
	}
	
	public float getTeleExperience(ItemStack stack)
	{
		for (Entry<ItemStack, Float> entry : this.experienceList.entrySet())
		{
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey()))
			{
				return ((Float)entry.getValue()).floatValue();
			}
		}
		return 0.0F;
	}
	
	
	
	
}
