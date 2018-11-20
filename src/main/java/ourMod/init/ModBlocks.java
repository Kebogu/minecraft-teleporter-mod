package ourMod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ourMod.blocks.BlockBase;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLUE_BLOCK = new BlockBase("blue_block",Material.IRON);
}
