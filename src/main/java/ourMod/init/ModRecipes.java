package ourMod.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(ModItems.SOULSTONE, new ItemStack(ModItems.BLUE_IGNOT,1), 1.5f);
		GameRegistry.addSmelting(ModBlocks.BLUE_ORE, new ItemStack(ModItems.BLUE_IGNOT,1), 1.5f);
		GameRegistry.addSmelting(ModBlocks.BLUE_BLOCK, new ItemStack(Blocks.DIAMOND_BLOCK,1), 1.5f);

	}
}
