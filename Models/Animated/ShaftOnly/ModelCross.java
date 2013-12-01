/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 14-03-2013 10:11:59
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models.Animated.ShaftOnly;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.model.ModelRenderer;

import org.lwjgl.opengl.GL11;

import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelCross extends RotaryModelBase
{
	//fields
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape13;
	ModelRenderer Shape12;
	ModelRenderer Shape14;
	ModelRenderer Shape14a;
	ModelRenderer Shape14b;
	ModelRenderer Shape14c;
	ModelRenderer Shape14b1;
	ModelRenderer Shape14b2;
	ModelRenderer Shape14b3;
	ModelRenderer Shape14b4;
	ModelRenderer Shape14b5;
	ModelRenderer Shape14b6;
	ModelRenderer Shape14b7;
	ModelRenderer Shape14b8;
	ModelRenderer Shape14b9;
	ModelRenderer Shape14b10;
	ModelRenderer Shape6;
	ModelRenderer Shape6a;
	ModelRenderer Shape6b;

	public ModelCross()
	{
		textureWidth = 128;
		textureHeight = 32;

		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape1.setRotationPoint(-8F, 23F, -8F);
		Shape1.setTextureSize(128, 32);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 64, 0);
		Shape2.addBox(0F, 0F, 0F, 1, 12, 16);
		Shape2.setRotationPoint(7F, 11F, -8F);
		Shape2.setTextureSize(128, 32);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 64, 0);
		Shape3.addBox(0F, 0F, 0F, 1, 12, 16);
		Shape3.setRotationPoint(-8F, 11F, -8F);
		Shape3.setTextureSize(128, 32);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 98, 15);
		Shape4.addBox(0F, 0F, 0F, 14, 12, 1);
		Shape4.setRotationPoint(-7F, 11F, 7F);
		Shape4.setTextureSize(128, 32);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 98, 15);
		Shape5.addBox(0F, 0F, 0F, 14, 12, 1);
		Shape5.setRotationPoint(-7F, 11F, -8F);
		Shape5.setTextureSize(128, 32);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0F, 0F, 0F);
		Shape13 = new ModelRenderer(this, 0, 27);
		Shape13.addBox(0F, -1F, -1F, 17, 2, 2);
		Shape13.setRotationPoint(-8.5F, 16F, 0F);
		Shape13.setTextureSize(128, 32);
		Shape13.mirror = true;
		this.setRotation(Shape13, 0.7853982F, 0F, 0F);
		Shape12 = new ModelRenderer(this, 0, 27);
		Shape12.addBox(0F, -1F, -1F, 17, 2, 2);
		Shape12.setRotationPoint(-8.5F, 16F, 0F);
		Shape12.setTextureSize(128, 32);
		Shape12.mirror = true;
		this.setRotation(Shape12, 0F, 0F, 0F);
		Shape14 = new ModelRenderer(this, 100, 0);
		Shape14.addBox(-1F, -1F, 0F, 2, 2, 5);
		Shape14.setRotationPoint(0F, 16F, -8.5F);
		Shape14.setTextureSize(128, 32);
		Shape14.mirror = true;
		this.setRotation(Shape14, 0F, 0F, 0.7853982F);
		Shape14a = new ModelRenderer(this, 100, 0);
		Shape14a.addBox(-1F, -1F, 0F, 2, 2, 5);
		Shape14a.setRotationPoint(0F, 16F, 3.5F);
		Shape14a.setTextureSize(128, 32);
		Shape14a.mirror = true;
		this.setRotation(Shape14a, 0F, 0F, 0.7853982F);
		Shape14b = new ModelRenderer(this, 100, 0);
		Shape14b.addBox(-2F, -2F, 0F, 4, 4, 1);
		Shape14b.setRotationPoint(0F, 20F, -4F);
		Shape14b.setTextureSize(128, 32);
		Shape14b.mirror = true;
		this.setRotation(Shape14b, 0F, 0F, 1.178097F);
		Shape14c = new ModelRenderer(this, 100, 0);
		Shape14c.addBox(-1F, -1F, 0F, 2, 2, 5);
		Shape14c.setRotationPoint(0F, 16F, -8.5F);
		Shape14c.setTextureSize(128, 32);
		Shape14c.mirror = true;
		this.setRotation(Shape14c, 0F, 0F, 0F);
		Shape14b1 = new ModelRenderer(this, 100, 0);
		Shape14b1.addBox(-1F, -1F, 0F, 2, 2, 7);
		Shape14b1.setRotationPoint(0F, 20F, -3.5F);
		Shape14b1.setTextureSize(128, 32);
		Shape14b1.mirror = true;
		this.setRotation(Shape14b1, 0F, 0F, 0.7853982F);
		Shape14b2 = new ModelRenderer(this, 100, 0);
		Shape14b2.addBox(-2F, -2F, 0F, 4, 4, 1);
		Shape14b2.setRotationPoint(0F, 20F, -4F);
		Shape14b2.setTextureSize(128, 32);
		Shape14b2.mirror = true;
		this.setRotation(Shape14b2, 0F, 0F, 0.3926991F);
		Shape14b3 = new ModelRenderer(this, 100, 0);
		Shape14b3.addBox(-2F, -2F, 0F, 4, 4, 1);
		Shape14b3.setRotationPoint(0F, 16F, -4F);
		Shape14b3.setTextureSize(128, 32);
		Shape14b3.mirror = true;
		this.setRotation(Shape14b3, 0F, 0F, 0F);
		Shape14b4 = new ModelRenderer(this, 100, 0);
		Shape14b4.addBox(-2F, -2F, 0F, 4, 4, 1);
		Shape14b4.setRotationPoint(0F, 16F, -4F);
		Shape14b4.setTextureSize(128, 32);
		Shape14b4.mirror = true;
		this.setRotation(Shape14b4, 0F, 0F, 0.7853982F);
		Shape14b5 = new ModelRenderer(this, 100, 0);
		Shape14b5.addBox(-2F, -2F, 0F, 4, 4, 1);
		Shape14b5.setRotationPoint(0F, 16F, 3F);
		Shape14b5.setTextureSize(128, 32);
		Shape14b5.mirror = true;
		this.setRotation(Shape14b5, 0F, 0F, 0F);
		Shape14b6 = new ModelRenderer(this, 100, 0);
		Shape14b6.addBox(-2F, -2F, 0F, 4, 4, 1);
		Shape14b6.setRotationPoint(0F, 16F, 3F);
		Shape14b6.setTextureSize(128, 32);
		Shape14b6.mirror = true;
		this.setRotation(Shape14b6, 0F, 0F, 0.7853982F);
		Shape14b7 = new ModelRenderer(this, 100, 0);
		Shape14b7.addBox(-2F, -2F, 0F, 4, 4, 1);
		Shape14b7.setRotationPoint(0F, 20F, 3F);
		Shape14b7.setTextureSize(128, 32);
		Shape14b7.mirror = true;
		this.setRotation(Shape14b7, 0F, 0F, 1.178097F);
		Shape14b8 = new ModelRenderer(this, 100, 0);
		Shape14b8.addBox(-2F, -2F, 0F, 4, 4, 1);
		Shape14b8.setRotationPoint(0F, 20F, 3F);
		Shape14b8.setTextureSize(128, 32);
		Shape14b8.mirror = true;
		this.setRotation(Shape14b8, 0F, 0F, 0.3926991F);
		Shape14b9 = new ModelRenderer(this, 100, 0);
		Shape14b9.addBox(-1F, -1F, 0F, 2, 2, 5);
		Shape14b9.setRotationPoint(0F, 16F, 3.5F);
		Shape14b9.setTextureSize(128, 32);
		Shape14b9.mirror = true;
		this.setRotation(Shape14b9, 0F, 0F, 0F);
		Shape14b10 = new ModelRenderer(this, 100, 0);
		Shape14b10.addBox(-1F, -1F, 0F, 2, 2, 7);
		Shape14b10.setRotationPoint(0F, 20F, -3.5F);
		Shape14b10.setTextureSize(128, 32);
		Shape14b10.mirror = true;
		this.setRotation(Shape14b10, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 66, 0);
		Shape6.addBox(0F, 0F, 0F, 4, 9, 1);
		Shape6.setRotationPoint(-2F, 14F, 5F);
		Shape6.setTextureSize(128, 32);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0F, 0F);
		Shape6a = new ModelRenderer(this, 66, 0);
		Shape6a.addBox(0F, 0F, 0F, 4, 5, 1);
		Shape6a.setRotationPoint(-2F, 18F, -0.5F);
		Shape6a.setTextureSize(128, 32);
		Shape6a.mirror = true;
		this.setRotation(Shape6a, 0F, 0F, 0F);
		Shape6b = new ModelRenderer(this, 66, 0);
		Shape6b.addBox(0F, 0F, 0F, 4, 9, 1);
		Shape6b.setRotationPoint(-2F, 14F, -6F);
		Shape6b.setTextureSize(128, 32);
		Shape6b.mirror = true;
		this.setRotation(Shape6b, 0F, 0F, 0F);
	}

	public void renderAll(List li, float phi, float phi2)
	{
		Shape1.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
		Shape6.render(f5);
		Shape6a.render(f5);
		Shape6b.render(f5);

		double d = 0.25;
		GL11.glTranslated(0, 1+d, 0);
		GL11.glRotatef(phi, 0, 0, 1);
		GL11.glTranslated(0, -1-d, 0);
		Shape14b.render(f5);
		Shape14b1.render(f5);
		Shape14b10.render(f5);
		Shape14b2.render(f5);
		Shape14b7.render(f5);
		Shape14b8.render(f5);
		GL11.glTranslated(0, 1+d, 0);
		GL11.glRotatef(-phi, 0, 0, 1);
		GL11.glTranslated(0, -1-d, 0);

		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(-phi, 0, 0, 1);
		GL11.glTranslated(0, -1, 0);
		Shape14.render(f5);
		Shape14c.render(f5);
		Shape14a.render(f5);
		Shape14b9.render(f5);
		Shape14b5.render(f5);
		Shape14b6.render(f5);
		Shape14b3.render(f5);
		Shape14b4.render(f5);
		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(phi, 0, 0, 1);
		GL11.glTranslated(0, -1, 0);

		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(phi2, 1, 0, 0);
		GL11.glTranslated(0, -1, 0);
		Shape13.render(f5);
		Shape12.render(f5);
		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(-phi2, 1, 0, 0);
		GL11.glTranslated(0, -1, 0);
	}

	@Override
	public void renderAll(ArrayList conditions, float phi, float theta) {}

}
