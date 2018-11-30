package ourMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TeleBlock extends BlockBase{

	public TeleBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(15.0F);
		setLightLevel(5.0F);
	}

}
