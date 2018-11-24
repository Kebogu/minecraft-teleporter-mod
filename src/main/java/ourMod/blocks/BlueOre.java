package ourMod.blocks;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import ourMod.init.ModItems;

public class BlueOre extends BlockBase{

	public BlueOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(5.0f);
		setResistance(15.0f);
//		iron = 2, stone = 1, wood = 0S
		setHarvestLevel("pickaxe",2);
//		 15.0f is very bright
		setLightLevel(1.0f);
	}
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.SOULSTONE;
	}
	@Override
	public int quantityDropped(Random rand) { 
		return rand.nextInt(3)+1;
	}

}
