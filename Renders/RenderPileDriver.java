/*******************************************************************************
 * @author Reika
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft.Renders;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.MinecraftForgeClient;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import Reika.DragonAPI.Interfaces.RenderFetcher;
import Reika.DragonAPI.Libraries.ReikaJavaLibrary;
import Reika.RotaryCraft.Auxiliary.IORenderer;
import Reika.RotaryCraft.Base.RotaryCraftTileEntity;
import Reika.RotaryCraft.Base.RotaryTERenderer;
import Reika.RotaryCraft.Base.TileEntityIOMachine;
import Reika.RotaryCraft.Models.ModelPileDriver;
import Reika.RotaryCraft.TileEntities.TileEntityPileDriver;

public class RenderPileDriver extends RotaryTERenderer
{
    
    private ModelPileDriver PileDriverModel = new ModelPileDriver();
    //private ModelPileDriverV PileDriverModelV = new ModelPileDriverV();

    /**
     * Renders the TileEntity for the position.
     */
    public void renderTileEntityPileDriverAt(TileEntityPileDriver tile, double par2, double par4, double par6, float par8)
    {
        int var9;

        if (!tile.isInWorld())
        {
            var9 = 0;
        }
        else
        {
            
            var9 = tile.getBlockMetadata();

            
            {
                //((BlockPileDriverBlock1)var10).unifyAdjacentChests(tile.worldObj, tile.xCoord, tile.yCoord, tile.zCoord);
                var9 = tile.getBlockMetadata();
            }
        }

        if (true)
        {
            ModelPileDriver var14;
            var14 = this.PileDriverModel;
            //ModelPileDriverV var15;
            //var14 = this.PileDriverModelV;
            this.bindTextureByName("/Reika/RotaryCraft/Textures/TileEntityTex/piletex.png");

            GL11.glPushMatrix();
            GL11.glEnable(GL12.GL_RESCALE_NORMAL);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glTranslatef((float)par2, (float)par4 + 2.0F, (float)par6 + 1.0F);
            GL11.glScalef(1.0F, -1.0F, -1.0F);
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            int var11 = 0;	 //used to rotate the model about metadata
            
            if (tile.isInWorld()) {
	            
	            switch(tile.getBlockMetadata()) {
	            case 0:
	            	var11 = 90;
	            break;
	            case 1:
	            	var11 = 0;
	            break;
	            }
	
	            GL11.glRotatef((float)var11, 0.0F, 1.0F, 0.0F);
	            
            }
            //float var12 = tile.prevLidAngle + (tile.lidAngle - tile.prevLidAngle) * par8;
            float var13;/*

            var12 = 1.0F - var12;
            var12 = 1.0F - var12 * var12 * var12;*/
           // if (tile.getBlockMetadata() < 4)
            var14.renderAll(ReikaJavaLibrary.makeListFrom(tile.power > 0), tile.phi);
           // else
            	//var15.renderAll();
            if (tile.isInWorld())
            GL11.glDisable(GL12.GL_RESCALE_NORMAL);
            GL11.glPopMatrix();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        }
    }

    public void renderTileEntityAt(TileEntity tile, double par2, double par4, double par6, float par8)
    {
    	if (this.isValidMachineRenderpass((RotaryCraftTileEntity)tile))
        this.renderTileEntityPileDriverAt((TileEntityPileDriver)tile, par2, par4, par6, par8);
        if (((RotaryCraftTileEntity) tile).isInWorld() && MinecraftForgeClient.getRenderPass() == 1)
        	IORenderer.renderIO((TileEntityIOMachine)tile, par2, par4, par6);
    }
    
	@Override
	public String getImageFileName(RenderFetcher te) {
		return "piletex.png";
	}
}