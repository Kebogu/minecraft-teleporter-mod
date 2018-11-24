package ourMod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ourMod.blocks.BlockBase;
import ourMod.blocks.BlueBlock;
import ourMod.blocks.BlueOre;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLUE_BLOCK = new BlueBlock("blue_block",Material.IRON);
	public static final Block BLUE_ORE = new BlueOre("blue_ore",Material.IRON);

//	public static final Block BLUE_BLOCK = new BlockBase("blue_block",Material.IRON);
}
