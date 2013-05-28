/*******************************************************************************
 * @author Reika
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 11/02/2013 10:25:49 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models;

import java.util.List;

import net.minecraft.client.model.ModelRenderer;

import org.lwjgl.opengl.GL11;

import Reika.RotaryCraft.Base.RotaryModelBase;


public class ModelBevel extends RotaryModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape3;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Shape15;
    ModelRenderer Shape16;
    ModelRenderer Shape17;
    ModelRenderer Shape18;
    ModelRenderer Shape19;
    ModelRenderer Shape20;
    ModelRenderer Shape21;
    ModelRenderer Shape22;
    ModelRenderer Shape23;
    ModelRenderer Shape2;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
  
  public ModelBevel()
  {
    textureWidth = 128;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 16, 1, 16);
      Shape1.setRotationPoint(-8F, 23F, -8F);
      Shape1.setTextureSize(128, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 64, 0);
      Shape3.addBox(0F, 0F, 0F, 1, 14, 16);
      Shape3.setRotationPoint(-8F, 9F, -8F);
      Shape3.setTextureSize(128, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape3.mirror = false;
      Shape12 = new ModelRenderer(this, 0, 27);
      Shape12.addBox(0F, 0F, 0F, 6, 2, 2);
      Shape12.setRotationPoint(-8.5F, 15F, -1F);
      Shape12.setTextureSize(128, 32);
      Shape12.mirror = true;
      setRotation(Shape12, 0F, 0F, 0F);
      Shape12.mirror = false;
      Shape13 = new ModelRenderer(this, 0, 27);
      Shape13.addBox(0F, 0F, 0F, 6, 2, 2);
      Shape13.setRotationPoint(-8.5F, 16F, -1.4F);
      Shape13.setTextureSize(128, 32);
      Shape13.mirror = true;
      setRotation(Shape13, 0.7853982F, 0F, 0F);
      Shape13.mirror = false;
      Shape14 = new ModelRenderer(this, 0, 24);
      Shape14.addBox(0F, 0F, 0F, 2, 2, 6);
      Shape14.setRotationPoint(-1F, 15F, -8.5F);
      Shape14.setTextureSize(128, 32);
      Shape14.mirror = true;
      setRotation(Shape14, 0F, 0F, 0F);
      Shape15 = new ModelRenderer(this, 0, 24);
      Shape15.addBox(0F, 0F, 0F, 2, 2, 6);
      Shape15.setRotationPoint(0F, 14.5F, -8.5F);
      Shape15.setTextureSize(128, 32);
      Shape15.mirror = true;
      setRotation(Shape15, 0F, 0F, 0.7853982F);
      Shape16 = new ModelRenderer(this, 101, 7);
      Shape16.addBox(0F, 0F, 0F, 1, 4, 4);
      Shape16.setRotationPoint(-3F, 14F, -2F);
      Shape16.setTextureSize(128, 32);
      Shape16.mirror = true;
      setRotation(Shape16, 0F, 0F, 0F);
      Shape17 = new ModelRenderer(this, 101, 7);
      Shape17.addBox(0F, 0F, 0F, 1, 4, 4);
      Shape17.setRotationPoint(-3F, 16F, -2.8F);
      Shape17.setTextureSize(128, 32);
      Shape17.mirror = true;
      setRotation(Shape17, 0.7853982F, 0F, 0F);
      Shape18 = new ModelRenderer(this, 101, 7);
      Shape18.addBox(0F, 0F, 0F, 4, 4, 1);
      Shape18.setRotationPoint(-2F, 14F, -3F);
      Shape18.setTextureSize(128, 32);
      Shape18.mirror = true;
      setRotation(Shape18, 0F, 0F, 0F);
      Shape19 = new ModelRenderer(this, 101, 7);
      Shape19.addBox(0F, 0F, 0F, 4, 4, 1);
      Shape19.setRotationPoint(0F, 13.2F, -3F);
      Shape19.setTextureSize(128, 32);
      Shape19.mirror = true;
      setRotation(Shape19, 0F, 0F, 0.7853982F);
      Shape20 = new ModelRenderer(this, 101, 7);
      Shape20.addBox(0F, 0F, 0F, 1, 6, 6);
      Shape20.setRotationPoint(-4F, 13F, -3F);
      Shape20.setTextureSize(128, 32);
      Shape20.mirror = true;
      setRotation(Shape20, 0F, 0F, 0F);
      Shape21 = new ModelRenderer(this, 101, 7);
      Shape21.addBox(0F, 0F, 0F, 1, 6, 6);
      Shape21.setRotationPoint(-4F, 16F, -4.2F);
      Shape21.setTextureSize(128, 32);
      Shape21.mirror = true;
      setRotation(Shape21, 0.7853982F, 0F, 0F);
      Shape22 = new ModelRenderer(this, 101, 7);
      Shape22.addBox(0F, 0F, 0F, 6, 6, 1);
      Shape22.setRotationPoint(-3F, 13F, -4F);
      Shape22.setTextureSize(128, 32);
      Shape22.mirror = true;
      setRotation(Shape22, 0F, 0F, 0F);
      Shape23 = new ModelRenderer(this, 101, 7);
      Shape23.addBox(0F, 0F, 0F, 6, 6, 1);
      Shape23.setRotationPoint(0F, 11.7F, -4F);
      Shape23.setTextureSize(128, 32);
      Shape23.mirror = true;
      setRotation(Shape23, 0F, 0F, 0.7853982F);
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(0F, 0F, 0F, 15, 14, 1);
      Shape2.setRotationPoint(-7F, 9F, -8F);
      Shape2.setTextureSize(128, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 0, 0);
      Shape4.addBox(0F, 0F, 0F, 1, 15, 1);
      Shape4.setRotationPoint(7F, 8F, 7F);
      Shape4.setTextureSize(128, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 0, 0);
      Shape5.addBox(0F, 0F, 0F, 1, 1, 15);
      Shape5.setRotationPoint(7F, 8F, -8F);
      Shape5.setTextureSize(128, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 0, 0);
      Shape6.addBox(0F, 0F, 0F, 15, 1, 1);
      Shape6.setRotationPoint(-8F, 8F, 7F);
      Shape6.setTextureSize(128, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 0, 0);
      Shape7.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape7.setRotationPoint(-8F, 8F, -8F);
      Shape7.setTextureSize(128, 32);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
  }
  
  public void renderAll(List li, float phi)
  {
      this.Shape1.render(f5);
      this.Shape2.render(f5);
      this.Shape3.render(f5);
      this.Shape4.render(f5);
      this.Shape5.render(f5);
      this.Shape6.render(f5);
      this.Shape7.render(f5);
      GL11.glTranslated(0, 1, 0);
      GL11.glRotatef(phi, 0, 0, 1);
      GL11.glTranslated(0, -1, 0);
      this.Shape14.render(f5);
      this.Shape15.render(f5);
      this.Shape18.render(f5);
      this.Shape19.render(f5);
      this.Shape22.render(f5);
      this.Shape23.render(f5);
      GL11.glTranslated(0, 1, 0);
      GL11.glRotatef(-phi, 0, 0, 1);
      GL11.glTranslated(0, -1, 0);
      
      GL11.glTranslated(0, 1, 0);
      GL11.glRotatef(-phi, 1, 0, 0);
      GL11.glTranslated(0, -1, 0);
      this.Shape12.render(f5);
      this.Shape13.render(f5);
      this.Shape16.render(f5);
      this.Shape17.render(f5);
      this.Shape20.render(f5);
      this.Shape21.render(f5);
      GL11.glTranslated(0, 1, 0);
      GL11.glRotatef(phi, 1, 0, 0);
      GL11.glTranslated(0, -1, 0);
  }

}