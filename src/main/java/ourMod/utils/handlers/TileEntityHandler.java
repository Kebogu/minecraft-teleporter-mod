package ourMod.utils.handlers;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ourMod.blocks.TileEntityTeleporterBlock;
import ourMod.utils.Reference;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityTeleporterBlock.class, new ResourceLocation(Reference.MOD_ID + ":Tele_Block"));
	}
}