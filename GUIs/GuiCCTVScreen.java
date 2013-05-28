/*******************************************************************************
 * @author Reika
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft.GUIs;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

import Reika.DragonAPI.Libraries.ReikaGuiAPI;
import Reika.RotaryCraft.Base.GuiMachine;
import Reika.RotaryCraft.Containers.ContainerScreen;
import Reika.RotaryCraft.TileEntities.TileEntityScreen;

public class GuiCCTVScreen extends GuiMachine {

	TileEntityScreen te;

	public GuiCCTVScreen(EntityPlayer ep, TileEntityScreen tile) {
		super(new ContainerScreen(ep, tile), tile);
		te = tile;
		ySize = 166;
		xSize = 176;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
        int j = (width - xSize) / 2;
        int k = (height - ySize) / 2;

        String i = "/Reika/RotaryCraft/Textures/GUI/screengui.png";
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(i);
        this.drawTexturedModalRect(j, k, 0, 0, xSize, ySize);

		this.drawPowerTab(j, k);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int par2, int par3) {
        ReikaGuiAPI.instance.drawCenteredStringNoShadow(fontRenderer, te.getName(), xSize/2, 6, 4210752);
        ReikaGuiAPI.instance.drawCenteredStringNoShadow(fontRenderer, "Camera Select", xSize/2, 54, 4210752);
        fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), xSize-58, (ySize - 96) + 3, 4210752);
	}

    @Override
	protected void drawPowerTab(int var5, int var6) {
    	int a = 2;
    	String var4 = "/Reika/RotaryCraft/Textures/GUI/powertab.png";
    	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    	mc.renderEngine.bindTexture(var4);
    	this.drawTexturedModalRect(xSize+var5, var6+0+a, 85, 4, 42, ySize-1);

    	long frac = (recv.power*29L)/recv.MINPOWER;
    	if (frac > 29)
    		frac = 29;
    	this.drawTexturedModalRect(xSize+var5+5, ySize+var6-149+a, 0, 0, (int)frac, 4);

    	frac = recv.omega*29L/recv.MINSPEED;
    	if (frac > 29)
    		frac = 29;
    	this.drawTexturedModalRect(xSize+var5+5, ySize+var6-90+a, 0, 0, (int)frac, 4);

    	frac = recv.torque*29L/recv.MINTORQUE;
    	if (frac > 29)
    		frac = 29;
    	this.drawTexturedModalRect(xSize+var5+5, ySize+var6-31+a, 0, 0, (int)frac, 4);

    	ReikaGuiAPI.instance.drawCenteredStringNoShadow(fontRenderer, "Power:", xSize+var5+20, var6+4+a, 0xff000000);
    	ReikaGuiAPI.instance.drawCenteredStringNoShadow(fontRenderer, "Speed:", xSize+var5+20, var6+63+a, 0xff000000);
    	ReikaGuiAPI.instance.drawCenteredStringNoShadow(fontRenderer, "Torque:", xSize+var5+20, var6+122+a, 0xff000000);
    }

}