/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * 
 * Distribution of the software in any form is only allowed
 * with explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft.Base;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import Reika.DragonAPI.Libraries.ReikaGuiAPI;
import Reika.DragonAPI.Libraries.ReikaJavaLibrary;
import Reika.RotaryCraft.GUIs.GuiTNTCannon;
import Reika.RotaryCraft.TileEntities.TileEntityProjector;
import Reika.RotaryCraft.TileEntities.TileEntityScaleableChest;

@SideOnly(Side.CLIENT)
public abstract class GuiMachine extends GuiContainer {

	protected RotaryCraftTileEntity tile;
	protected TileEntityPowerReceiver recv;
	protected EntityPlayer ep;

	public GuiMachine(Container par1Container, RotaryCraftTileEntity te) {
		super(par1Container);
		tile = te;
		if (te instanceof TileEntityPowerReceiver)
			recv = (TileEntityPowerReceiver)te;
	}

	public abstract String getGuiTexture();

	/**
	 * Draw the foreground layer for the GuiContainer (everything in front of the items)
	 */
	@Override
	protected void drawGuiContainerForegroundLayer(int a, int b)
	{
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;
		if (tile instanceof TileEntityProjector)
			fontRenderer.drawString(tile.getMultiValuedName(), 6, 6, 4210752);
		else if (tile instanceof TileEntityScaleableChest)
			fontRenderer.drawString(tile.getMultiValuedName(), 8, 6, 4210752);
		else
			ReikaGuiAPI.instance.drawCenteredStringNoShadow(fontRenderer, tile.getMultiValuedName(), xSize/2, 5, 4210752);
		if (tile instanceof IInventory && this.getGuiTexture() != "targetgui" && !(this instanceof GuiTNTCannon))
			fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), xSize-58, (ySize - 96) + 3, 4210752);
	}

	@Override
	public final boolean doesGuiPauseGame()
	{
		return false;
	}

	@Override
	public void updateScreen() {
		super.updateScreen();
		//x = Mouse.getX();
		//y = Mouse.getY();
	}

	public final void refreshScreen() {
		//int lastx = x;
		//int lasty = y;
		//mc.thePlayer.closeScreen();
		//ModLoader.openGUI(player, new GuiReservoir(player, Reservoir));
		//Mouse.setCursorPosition(lastx, lasty);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;

		String i = "/Reika/RotaryCraft/Textures/GUI/"+this.getGuiTexture()+".png";
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(i);
		this.drawTexturedModalRect(j, k, 0, 0, xSize, ySize);
		if (tile instanceof TileEntityPowerReceiver)
			this.drawPowerTab(j, k);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(i);
		if (ep == null && !(this instanceof GuiOneSlotInv))
			ReikaJavaLibrary.pConsole("Gui for "+tile.getMultiValuedName()+" did not set player entity!");
	}

	protected abstract void drawPowerTab(int j, int k);

	public void drawHelpTab(int j, int k) {

	}

	public void callHelpAction(int j, int k) {

	}
}
