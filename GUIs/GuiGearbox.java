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

import Reika.DragonAPI.Libraries.ReikaMathLibrary;
import Reika.RotaryCraft.Base.GuiNonPoweredMachine;
import Reika.RotaryCraft.Containers.ContainerGearbox;
import Reika.RotaryCraft.TileEntities.TileEntityGearbox;

public class GuiGearbox extends GuiNonPoweredMachine
{
    private TileEntityGearbox gearboxInventory;

    public GuiGearbox(EntityPlayer player, TileEntityGearbox Gearbox)
    {
        super(new ContainerGearbox(player, Gearbox), Gearbox);
        gearboxInventory = Gearbox;
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    @Override
	protected void drawGuiContainerForegroundLayer(int a, int b)
    {
        int j = (width - xSize) / 2;
        int k = (height - ySize) / 2;
        fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), xSize-58, (ySize - 96) + 2, 4210752);
        fontRenderer.drawString("Gearbox", xSize/3+9, 6, 4210752);
        fontRenderer.drawString("Lubricant", 5, 11, 4210752);

        fontRenderer.drawString("Damage:", 68, 60, 0x000000);
        int damage = (int)(100*(1-ReikaMathLibrary.doubpow(0.99, gearboxInventory.damage)));
        if (damage < 10)
        	fontRenderer.drawString(String.format("%5d%s", damage, "%"), 122, 60, 0x00ff00);
        if (damage < 25 && damage >= 10)
        	fontRenderer.drawString(String.format("%5d%s", damage, "%"), 122, 60, 0x55ff00);
        if (damage < 50 && damage >= 25)
        	fontRenderer.drawString(String.format("%5d%s", damage, "%"), 122, 60, 0xffff00);
        if (damage < 80 && damage >= 50)
        	fontRenderer.drawString(String.format("%5d%s", damage, "%"), 122, 60, 0xff5500);
        if (damage >= 80)
        	fontRenderer.drawString(String.format("%5d%s", damage, "%"), 122, 60, 0xff0000);

        fontRenderer.drawString("Ratio:", 80, 24, 0x000000);
        fontRenderer.drawString("Mode:", 80, 36, 0x000000);
        fontRenderer.drawString("Power:", 74, 48, 0x000000);

        fontRenderer.drawString(String.format("%5d ", gearboxInventory.ratio), 127, 24, 0x000000);
        if (gearboxInventory.reduction)
        	fontRenderer.drawString("Torque", 115, 36, 0x000000);
        else
        	fontRenderer.drawString(" Speed", 115, 36, 0x000000);

        if (gearboxInventory.power < 1000)
        	fontRenderer.drawString(String.format("%3d  W", gearboxInventory.power), 122, 48, 0x000000);
        if (gearboxInventory.power < 1000000 && gearboxInventory.power >= 1000)
        	fontRenderer.drawString(String.format("%.1f kW", gearboxInventory.power/1000D), 112, 48, 0x000000);
        if (gearboxInventory.power >= 1000000)
        	fontRenderer.drawString(String.format("%.1f MW", gearboxInventory.power/1000000D), 112, 48, 0x000000);
    }

    /**
     * Draw the background layer for the GuiContainer (everything behind the items)
     */
    @Override
	protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        String i = "/Reika/RotaryCraft/Textures/GUI/gearboxgui.png";
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(i);
        int j = (width - xSize) / 2;
        int k = (height - ySize) / 2;
        this.drawTexturedModalRect(j, k, 0, 0, xSize, ySize);

        int i2 = gearboxInventory.getLubricantScaled(55);
        int i3 = 0;
        if (i2 != 0)
        	i3 = 1;
        this.drawTexturedModalRect(j + 24, ySize/2+k-7-i2, 176, 126-i2, 8, i2);
    }
}