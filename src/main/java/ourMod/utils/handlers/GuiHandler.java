package ourMod.utils.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import ourMod.blocks.ContainerTeleBlock;
import ourMod.blocks.GuiTeleBlock;
import ourMod.blocks.TileEntityTeleporterBlock;
import ourMod.utils.Reference;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_TELE_BLOCK) return new ContainerTeleBlock(player.inventory, (TileEntityTeleporterBlock)world.getTileEntity(new BlockPos(x,y,z)));
		
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_TELE_BLOCK) return new GuiTeleBlock(player.inventory, (TileEntityTeleporterBlock)world.getTileEntity(new BlockPos(x,y,z)));
		
		return null;
	}
}