package ourMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlueOre extends BlockBase{

	public BlueOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(3.0f);
		setResistance(15.0f);
//		iron = 2, stone = 1, wood = 0S
		setHarvestLevel("pickaxe",2);
//		 15.0f is very bright
		setLightLevel(1.0f);
	}

}
