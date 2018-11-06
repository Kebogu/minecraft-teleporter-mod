package angelsMod.init;

import java.util.ArrayList;
import java.util.List;

import angelsMod.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLUE_BLOCK = new BlockBase("blue_block",Material.IRON);
}
